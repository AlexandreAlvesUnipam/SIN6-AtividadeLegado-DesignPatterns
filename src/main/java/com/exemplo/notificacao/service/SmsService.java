package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

/** Strategy concreta: SMS */
@Service
public class SmsService implements Notifier {

    public void enviar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }

    @Override
    public void send(Pedido pedido) {
        enviar(pedido);
    }
}
