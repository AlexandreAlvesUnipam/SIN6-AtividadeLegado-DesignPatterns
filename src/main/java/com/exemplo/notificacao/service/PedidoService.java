package com.exemplo.notificacao.service;

import com.exemplo.notificacao.event.OrderCreatedEvent;
import com.exemplo.notificacao.model.Pedido;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/** Cria pedido e publica evento (Observer - publisher). */
@Service
public class PedidoService {

    private final ApplicationEventPublisher publisher;

    public PedidoService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        // Publica evento para acionar notificações
        publisher.publishEvent(new OrderCreatedEvent(pedido));
    }
}
