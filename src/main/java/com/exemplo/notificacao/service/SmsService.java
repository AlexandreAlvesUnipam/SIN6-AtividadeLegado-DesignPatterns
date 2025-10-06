package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements Notificador {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("[SMS] Notificação enviada para " + pedido.getCliente() 
            + " | Pedido valor: R$" + pedido.getValor());
    }
}
