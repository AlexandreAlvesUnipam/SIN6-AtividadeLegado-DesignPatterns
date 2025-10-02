package com.exemplo.notificacao.event;

import com.exemplo.notificacao.model.Pedido;

public record OrderCreatedEvent(Pedido pedido) {}
