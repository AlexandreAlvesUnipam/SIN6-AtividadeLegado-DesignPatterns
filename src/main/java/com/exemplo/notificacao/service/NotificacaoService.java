package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import com.exemplo.notificacao.notifier.Notificador;
import java.util.List;

@Service
public class NotificacaoService {

    private final List<Notificador> notifiers;

    public NotificacaoService(List<Notificador> notifiers) {
        this.notifiers = notifiers;
    }

    public void enviarNotificacoes(Pedido pedido) {
        for (Notificador n : notifiers) {
            try {
                n.enviar(pedido);
            } catch (Exception e) {
                System.err.println("Erro ao enviar via " + n.nome() + ": " + e.getMessage());
            }
        }
    }
}
