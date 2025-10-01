package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PushNotificador implements Notificador {

    private static final Logger logger = LoggerFactory.getLogger(PushNotificador.class);

    @Override
    public void enviar(Pedido pedido) {
        logger.info("Enviando push notification para {}", pedido.getCliente());
    }
}