package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.strategy.NotificacaoStrategy;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements NotificacaoStrategy {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
}
