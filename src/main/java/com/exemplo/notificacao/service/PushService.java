package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PushService implements NotificacaoStrategy {
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }
    
    @Override
    public String getTipo() {
        return "PUSH";
    }
}