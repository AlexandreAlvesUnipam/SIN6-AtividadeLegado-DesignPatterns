package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppService implements Notificador {
    
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("💬 [WHATSAPP] para " + pedido.getCliente() + 
                         " - R$ " + pedido.getValor());
    }
}