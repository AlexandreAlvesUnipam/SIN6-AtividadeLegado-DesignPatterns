package com.exemplo.notificacao.strategy;

import com.exemplo.notificacao.model.Pedido;

public interface NotificacaoStrategy {
    void enviar(Pedido pedido);
}
