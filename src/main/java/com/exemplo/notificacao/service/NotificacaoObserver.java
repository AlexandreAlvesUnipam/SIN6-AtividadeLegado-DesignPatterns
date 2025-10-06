package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoObserver implements PedidoObserver {

    private final NotificacaoService notificacaoService;

    public NotificacaoObserver(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("=== Notificações para pedido de " + pedido.getCliente() + " ===");
        notificacaoService.enviarTodasNotificacoes(pedido);
    }
}