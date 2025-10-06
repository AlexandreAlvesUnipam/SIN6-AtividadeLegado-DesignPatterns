package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PushService implements Notificador {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("[PUSH] Notificação enviada para " + pedido.getCliente() 
            + " | Pedido valor: R$" + pedido.getValor());
    }
}
