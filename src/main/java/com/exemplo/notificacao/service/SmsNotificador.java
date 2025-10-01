package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificador implements Notificador {

    private static final Logger logger = LoggerFactory.getLogger(SmsNotificador.class);

    @Override
    public void enviar(Pedido pedido) {
        logger.info("Enviando SMS para {}", pedido.getCliente());
    }
}