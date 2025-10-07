package com.exemplo.notificacao.model;

import java.time.LocalDateTime;

public class Pedido {
    private final String cliente;
    private final double valor;
    private final String id;
    private final LocalDateTime dataCriacao;
    private final String status;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.valor = builder.valor;
        this.id = builder.id;
        this.dataCriacao = builder.dataCriacao;
        this.status = builder.status;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    // ====== Builder Pattern ======
    public static class Builder {
        private String cliente;
        private double valor;
        private String id;
        private LocalDateTime dataCriacao = LocalDateTime.now();
        private String status = "PENDENTE";

        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder valor(double valor) {
            this.valor = valor;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                ", dataCriacao=" + dataCriacao +
                '}';
    }
}
