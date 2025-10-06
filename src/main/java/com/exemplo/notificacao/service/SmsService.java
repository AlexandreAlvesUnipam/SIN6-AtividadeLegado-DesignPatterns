package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

/**
 * Serviço de notificação via SMS.
 */
@Service
public class SmsService implements Notificador {
    
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📱 [SMS] Enviando SMS para " + pedido.getCliente() + 
                         " - Valor: R$ " + pedido.getValor());
    }
}