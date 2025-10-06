package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Cliente;
import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final NotificacaoService notificacaoService;

    public PedidoService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(Cliente cliente, double valor) {
        if (cliente == null || cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Cliente inválido");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero");
        }

        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente.getNome());
        notificacaoService.enviarNotificacoes(pedido);
    }
}