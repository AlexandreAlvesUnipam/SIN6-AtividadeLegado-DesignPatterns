package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IObserver {

    @Override
    public void enviaNotificacoes(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
}
