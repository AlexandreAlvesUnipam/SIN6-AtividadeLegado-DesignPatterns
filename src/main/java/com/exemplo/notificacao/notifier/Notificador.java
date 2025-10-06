package com.exemplo.notificacao.notifier;

import com.exemplo.notificacao.model.Pedido;

public interface Notificador {
    void enviar(Pedido pedido);
    String nome(); // opcional, útil para logs/revisões
}