package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.model.PedidoObserver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final List<PedidoObserver> observers;

    public PedidoService(List<PedidoObserver> observers) {
        this.observers = observers;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        
        observers.forEach(pedido::addObserver);
        
        System.out.println("Pedido criado para o cliente: " + cliente);
        
        pedido.notificarObservers();
    }

    public void criarPedidoComNotificacoesCustomizadas(String cliente, double valor, List<String> tiposNotificacao) {
        Pedido pedido = new Pedido(cliente, valor);
        
        System.out.println("Pedido criado para o cliente: " + cliente);

    }
}