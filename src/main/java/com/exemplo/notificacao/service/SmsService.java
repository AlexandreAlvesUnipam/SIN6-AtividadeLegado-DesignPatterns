package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SmsService implements Notificador {

    private static final Logger logger = LoggerFactory.getLogger(SmsService.class);

    @Override
    public void enviar(Pedido pedido) {
        logger.info("Enviando notificação por SMS para o cliente: {}", pedido.getCliente());
    }
}
