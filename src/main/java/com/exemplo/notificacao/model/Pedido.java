package com.exemplo.notificacao.model;

public class Pedido {
    private String cliente;
    private double valor;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}