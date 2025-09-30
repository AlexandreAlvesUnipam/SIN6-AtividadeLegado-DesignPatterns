package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificador implements Notificador {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
}