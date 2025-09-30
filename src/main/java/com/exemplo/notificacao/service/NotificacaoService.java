package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificacaoService {

    private final List<Notificador> notificadores;

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(Pedido pedido) {
        notificadores.forEach(notificador -> notificador.enviar(pedido));
    }
}