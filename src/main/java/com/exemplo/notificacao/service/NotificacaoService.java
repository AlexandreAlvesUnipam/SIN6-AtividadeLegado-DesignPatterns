package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificacaoService {

    private final List<Notificador> notificadores;

    // O Spring injetará automaticamente uma lista de todos os beans 
    // que implementam a interface Notificador
    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void enviarNotificacoes(Pedido pedido) {
        System.out.println("Disparando notificações para o pedido do cliente: " + pedido.getCliente());
        // Itera sobre a lista e chama o método enviar de cada notificador
        notificadores.forEach(notificador -> notificador.enviar(pedido));
        System.out.println("---");
    }
}