package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface Notifier {
    void send(Pedido pedido);
}
