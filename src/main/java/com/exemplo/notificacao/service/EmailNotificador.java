package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificador implements Notificador {

    private static final Logger logger = LoggerFactory.getLogger(EmailNotificador.class);

    @Override
    public void enviar(Pedido pedido) {
        logger.info("Enviando e-mail para {}", pedido.getCliente());
    }
}