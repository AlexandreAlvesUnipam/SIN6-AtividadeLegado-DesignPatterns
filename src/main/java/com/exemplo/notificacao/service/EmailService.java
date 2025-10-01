package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

/**
 * Serviço de notificação via e-mail.
 * Implementa o padrão Strategy através da interface Notificador.
 */
@Service
public class EmailService implements Notificador {
    
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📧 [EMAIL] Enviando e-mail para " + pedido.getCliente() + 
                         " - Valor: R$ " + pedido.getValor());
    }
}