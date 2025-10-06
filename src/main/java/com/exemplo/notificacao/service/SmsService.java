package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements NotificacaoStrategy {
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
    
    @Override
    public String getTipo() {
        return "SMS";
    }
}