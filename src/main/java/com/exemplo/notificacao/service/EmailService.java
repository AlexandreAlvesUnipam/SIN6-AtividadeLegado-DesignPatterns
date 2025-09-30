package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.observer.ObservadorPedido;
import org.springframework.stereotype.Service;

// Ele implementa a interface ObservadorPedido, é avisado sempre que um pedido novo aparecer.

@Service
public class EmailService implements ObservadorPedido {

    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }

    @Override
    public void atualizar(Pedido pedido) {
        enviar(pedido);
    }
}