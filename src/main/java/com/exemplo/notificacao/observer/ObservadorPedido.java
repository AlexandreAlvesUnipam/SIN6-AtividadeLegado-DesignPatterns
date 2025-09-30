package com.exemplo.notificacao.observer;

import com.exemplo.notificacao.model.Pedido;

public interface ObservadorPedido {
    /**
     * Método chamado pelo Subject quando um novo pedido precisa notificar os observadores.
     */
    void atualizar(Pedido pedido);
}
