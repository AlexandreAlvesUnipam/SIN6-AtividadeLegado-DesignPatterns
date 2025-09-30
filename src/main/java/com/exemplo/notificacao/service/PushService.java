package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class PushService implements NotificacaoStrategy {

    @Override
    public String canal() {
        return "push";
    }

    @Override
    public void notificar(Pedido pedido) {
        String titulo = "🎉 Novo pedido recebido!";
        String mensagem = String.format(
            "Oi %s, recebemos seu pedido de R$ %.2f. Toque para ver os detalhes.",
            pedido.getCliente(), pedido.getValor()
        );
        System.out.printf("[PUSH] Título: %s | Mensagem: %s%n", titulo, mensagem);
        // Aqui você chamaria o provider de push (FCM/APNs).
    }
}
