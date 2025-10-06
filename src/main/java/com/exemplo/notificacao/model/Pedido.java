package com.exemplo.notificacao.model;

public class Pedido {
    private Cliente cliente;
    private double valor;

    public Pedido(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}