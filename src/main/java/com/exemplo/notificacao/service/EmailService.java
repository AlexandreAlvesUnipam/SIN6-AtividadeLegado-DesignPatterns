package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // opcional: define a ordem de execução
public class EmailService implements NotificacaoStrategy {

    @Override
    public String canal() {
        return "email";
    }

    @Override
    public void notificar(Pedido pedido) {
        // Personalização do conteúdo do canal
        String assunto = "Confirmação do seu pedido";
        String corpo = String.format(
            "Olá %s,\n\nSeu pedido no valor de R$ %.2f foi recebido e está em processamento.\n" +
            "Acompanhe pelo portal ou aplicativo.\n\nAbraços,\nEquipe",
            pedido.getCliente(), pedido.getValor()
        );
        System.out.printf("[EMAIL] Assunto: %s | Para: %s | Corpo: %s%n",
                assunto, pedido.getCliente(), corpo);
        // Aqui você chamaria de fato o client SMTP/SES/etc.
    }
}
