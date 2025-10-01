package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

/**
 * Interface para o padrão Strategy.
 * Define o contrato para todos os notificadores.
 */
public interface Notificador {
    void notificar(Pedido pedido);
}