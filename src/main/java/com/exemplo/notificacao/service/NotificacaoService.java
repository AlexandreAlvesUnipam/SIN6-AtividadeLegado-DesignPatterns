package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class NotificacaoService {

    private static final Logger logger = LoggerFactory.getLogger(NotificacaoService.class);
    private final List<Notificador> notificadores;

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(Pedido pedido) {
        logger.info("Iniciando envio de notificações para o cliente: {}", pedido.getCliente());
        for (Notificador notificador : notificadores) {
            notificador.enviar(pedido);
        }
        logger.info("Todas as notificações foram enviadas para o cliente: {}", pedido.getCliente());
    }
}
