package com.exemplo.notificacao.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private double valor;
    private List<PedidoObserver> observers;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.observers = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public void addObserver(PedidoObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(PedidoObserver observer) {
        this.observers.remove(observer);
    }

    public void notificarObservers() {
        observers.forEach(observer -> observer.notificar(this));
    }
}