package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.notifier.Notificador;
import org.springframework.stereotype.Service;

@Service
public class PushService implements Notificador {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }

    @Override
    public String nome() {
        return "push";
    }
}