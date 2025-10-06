package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.notifier.Notificador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoService {

    private final List<Notificador> notifiers;

    public NotificacaoService(List<Notificador> notifiers) {
        this.notifiers = notifiers;
    }

    public void enviarNotificacoes(Pedido pedido) {
        // percorre todos os notifiers registrados pelo Spring
        for (Notificador n : notifiers) {
            try {
                n.enviar(pedido);
            } catch (Exception e) {
                // log simples para não interromper notificações restantes
                System.err.println("Erro ao enviar via " + n.nome() + ": " + e.getMessage());
            }
        }
    }
}