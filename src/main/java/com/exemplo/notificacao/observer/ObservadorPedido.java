package com.exemplo.notificacao.observer;

import com.exemplo.notificacao.model.Pedido;

public interface ObservadorPedido {

    // Interface para os serviços que quiserem receber notificações precisam implementar esse contrato.
    // O método atualizar(Pedido pedido) será chamado automaticamente quando um novo pedido for criado.
    void atualizar(Pedido pedido);
}