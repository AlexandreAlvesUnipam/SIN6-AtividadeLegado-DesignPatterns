package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private NotificacaoStrategy strategy;

    public void setStrategy(NotificacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void enviarNotificacoes(Pedido pedido) {
        if (strategy != null) {
            strategy.enviar(pedido, "Mensagem padrão");
        } else {
            System.out.println("Nenhuma estratégia de notificação definida!");
        }
    }

    public void enviarNotificacao(Pedido pedido1, String string) {
        throw new UnsupportedOperationException("Unimplemented method 'enviarNotificacao'");
    }
}
