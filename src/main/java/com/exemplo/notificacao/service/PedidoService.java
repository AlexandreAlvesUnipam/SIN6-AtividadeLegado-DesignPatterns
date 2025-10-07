package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final NotificacaoService notificacaoService;

    public PedidoService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido.Builder()
                .cliente(cliente)
                .valor(valor)
                .build();

        System.out.println("Pedido criado para o cliente: " + cliente);
        notificacaoService.enviarNotificacoes(pedido);
    }
}
