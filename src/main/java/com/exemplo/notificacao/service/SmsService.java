package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.notifier.Notificador;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements Notificador {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }

    @Override
    public String nome() {
        return "sms";
    }
}