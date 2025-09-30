package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.observer.ObservadorPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class NotificacaoService {

    private final CopyOnWriteArrayList<ObservadorPedido> observadores;

    /**
     * O Spring injeta todos os beans que implementam ObservadorPedido.
     * Criamos uma CopyOnWriteArrayList para permitir registro/remocao seguro em tempo de execução.
     */
    @Autowired
    public NotificacaoService(List<ObservadorPedido> observadores) {
        this.observadores = new CopyOnWriteArrayList<>(observadores);
    }

    public void registrar(ObservadorPedido observador) {
        observadores.addIfAbsent(observador);
    }

    public void remover(ObservadorPedido observador) {
        observadores.remove(observador);
    }

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
