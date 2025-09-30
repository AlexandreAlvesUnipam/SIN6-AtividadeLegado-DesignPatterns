package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

/** Contrato comum para todos os canais de notificação. */
public interface NotificacaoStrategy {
    /** Nome do canal (apenas para logs/erros). */
    String canal();

    /** Implementação da notificação do canal. */
    void notificar(Pedido pedido);
}
