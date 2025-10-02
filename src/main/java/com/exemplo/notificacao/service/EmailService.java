package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

/** Strategy concreta: Email */
@Service
public class EmailService implements Notifier {

    // Método antigo mantido para compatibilidade (opcional)
    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }

    @Override
    public void send(Pedido pedido) {
        enviar(pedido);
    }
}
