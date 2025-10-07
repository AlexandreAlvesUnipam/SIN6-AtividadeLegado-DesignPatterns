package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.strategy.NotificacaoStrategy;
import com.exemplo.notificacao.factory.NotificacaoStrategyFactory;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private final List<NotificacaoStrategy> estrategias;
    private final NotificacaoStrategyFactory factory;

    public NotificacaoService(List<NotificacaoStrategy> estrategias, NotificacaoStrategyFactory factory) {
        this.estrategias = estrategias;
        this.factory = factory;
    }

    public void enviarNotificacoes(Pedido pedido) {
        for (NotificacaoStrategy estrategia : estrategias) {
            estrategia.enviar(pedido);
        }
    }

    // Novo método: permite escolher dinamicamente os tipos de notificação
    public void enviarNotificacoesPorTipo(Pedido pedido, List<String> tipos) {
        List<NotificacaoStrategy> selecionadas = factory.getEstrategias(tipos);
        for (NotificacaoStrategy estrategia : selecionadas) {
            estrategia.enviar(pedido);
        }
    }
}
