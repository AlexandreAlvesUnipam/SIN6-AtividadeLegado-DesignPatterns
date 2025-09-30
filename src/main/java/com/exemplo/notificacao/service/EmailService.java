package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.observer.ObservadorPedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements ObservadorPedido {

    public void enviar(Pedido pedido) {
        // Lógica real de envio de e-mail ficaria aqui
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }

    @Override
    public void atualizar(Pedido pedido) {
        enviar(pedido);
    }
}
