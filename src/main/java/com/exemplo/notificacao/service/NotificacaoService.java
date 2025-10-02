package com.exemplo.notificacao.service;

import com.exemplo.notificacao.event.OrderCreatedEvent;
import com.exemplo.notificacao.model.Pedido;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

/** Escuta o evento e envia por todos os canais (Strategy + "Composite" via lista). */
@Service
public class NotificacaoService {

    private final List<Notifier> notifiers;

    public NotificacaoService(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    /** Também pode ser chamado direto se quiser. */
    public void enviarNotificacoes(Pedido pedido) {
        notifiers.forEach(n -> n.send(pedido));
    }

    /** Observer: reage ao evento publicado pelo PedidoService. */
    @EventListener
    public void onOrderCreated(OrderCreatedEvent event) {
        enviarNotificacoes(event.pedido());
    }
}
