package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.observer.ObservadorPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Classe mãe das notificações
// Ela guarda uma lista de todos os serviços que querem receber avisos, email, sms e push.
// Quando um pedido novo é criado, ela avisa todos de uma vez.

@Service
public class NotificacaoService {

    private final CopyOnWriteArrayList<ObservadorPedido> observadores;

    @Autowired
    public NotificacaoService(List<ObservadorPedido> observadores) {
        this.observadores = new CopyOnWriteArrayList<>(observadores);
    }

    // Registrar manualmente outro observador
    public void registrar(ObservadorPedido observador) {
        observadores.addIfAbsent(observador);
    }

    // Remover alugm observador
    public void remover(ObservadorPedido observador) {
        observadores.remove(observador);
    }

    // Método que chama todos os observadores.
    public void notificarObservadores(Pedido pedido) {
        for (ObservadorPedido observador : observadores) {
            try {
                observador.atualizar(pedido);
            } catch (Exception e) {
                // Tratamento simples — você pode trocar por logger, métricas, fila de retry, etc.
                System.err.println("Erro ao notificar " + observador.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}