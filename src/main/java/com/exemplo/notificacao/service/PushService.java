package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.observer.ObservadorPedido;
import org.springframework.stereotype.Service;

// Cuida das notificações por push.

@Service
public class PushService implements ObservadorPedido {

    public void enviar(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }

    @Override
    public void atualizar(Pedido pedido) {
        enviar(pedido);
    }
}