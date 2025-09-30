package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PushService implements IObserver {
    @Override
    public void enviaNotificacoes(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }
}
