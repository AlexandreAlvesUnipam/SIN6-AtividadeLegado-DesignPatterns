package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

/**
 * Serviço de notificação via Push.
 */
@Service
public class PushService implements Notificador {
    
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("🔔 [PUSH] Enviando push para " + pedido.getCliente() + 
                         " - Valor: R$ " + pedido.getValor());
    }
}