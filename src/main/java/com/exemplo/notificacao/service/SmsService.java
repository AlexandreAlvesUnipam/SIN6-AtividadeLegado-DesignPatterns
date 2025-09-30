package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements NotificacaoStrategy {

    @Override
    public String canal() {
        return "sms";
    }

    @Override
    public void notificar(Pedido pedido) {
        String texto = String.format(
            "Pedido confirmado! Cliente: %s | Total R$ %.2f. Acompanhe no app. 📲",
            pedido.getCliente(), pedido.getValor()
        );
        System.out.printf("[SMS] %s%n", texto);
        // Aqui você chamaria o gateway de SMS (Twilio, etc.)
    }
}
