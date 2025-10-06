package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface NotificacaoStrategy {
    void enviar(Pedido pedido);
    String getTipo();
}