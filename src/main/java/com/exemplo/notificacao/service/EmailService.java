package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements NotificacaoStrategy {
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
    
    @Override
    public String getTipo() {
        return "EMAIL";
    }
}