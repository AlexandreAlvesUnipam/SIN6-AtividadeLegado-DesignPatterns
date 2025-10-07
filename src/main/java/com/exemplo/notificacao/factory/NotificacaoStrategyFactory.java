package com.exemplo.notificacao.factory;

import com.exemplo.notificacao.strategy.NotificacaoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class NotificacaoStrategyFactory {
    private final Map<String, NotificacaoStrategy> estrategias;

    @Autowired
    public NotificacaoStrategyFactory(Map<String, NotificacaoStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public List<NotificacaoStrategy> getEstrategias(List<String> tipos) {
        List<NotificacaoStrategy> selecionadas = new ArrayList<>();
        for (String tipo : tipos) {
            NotificacaoStrategy estrategia = estrategias.get(tipo);
            if (estrategia != null) {
                selecionadas.add(estrategia);
            }
        }
        return selecionadas;
    }
}
