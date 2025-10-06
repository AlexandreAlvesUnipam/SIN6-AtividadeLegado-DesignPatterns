package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.factory.PedidoFactory;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final NotificacaoService notificacaoService;
    private final PedidoFactory pedidoFactory;

    public PedidoService(NotificacaoService notificacaoService, PedidoFactory pedidoFactory) {
        this.notificacaoService = notificacaoService;
        this.pedidoFactory = pedidoFactory;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = pedidoFactory.criarPedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        notificacaoService.enviarNotificacoes(pedido);
    }
}
