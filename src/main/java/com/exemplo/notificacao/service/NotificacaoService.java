package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NotificacaoService {

    private final Map<String, NotificacaoStrategy> estrategiasNotificacao;

    public NotificacaoService(List<NotificacaoStrategy> estrategias) {
        this.estrategiasNotificacao = estrategias.stream()
                .collect(Collectors.toMap(NotificacaoStrategy::getTipo, estrategia -> estrategia));
    }

    public void enviarNotificacao(Pedido pedido, String tipoNotificacao) {
        NotificacaoStrategy estrategia = estrategiasNotificacao.get(tipoNotificacao);
        if (estrategia != null) {
            estrategia.enviar(pedido);
        } else {
            throw new IllegalArgumentException("Tipo de notificação não suportado: " + tipoNotificacao);
        }
    }

    public void enviarTodasNotificacoes(Pedido pedido) {
        estrategiasNotificacao.values().forEach(estrategia -> estrategia.enviar(pedido));
    }

    public void enviarNotificacoesSelecionadas(Pedido pedido, List<String> tiposNotificacao) {
        tiposNotificacao.forEach(tipo -> enviarNotificacao(pedido, tipo));
    }
}