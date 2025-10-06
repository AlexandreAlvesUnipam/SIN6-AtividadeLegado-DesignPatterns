package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import com.exemplo.notificacao.notifier.Notificador;

@Service
public class EmailService implements Notificador {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
    @Override
    public String nome() {
        return "email";
    }
}
