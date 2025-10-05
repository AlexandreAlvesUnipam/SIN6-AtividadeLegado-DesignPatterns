package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Gerenciador de notificações - Padrão Observer.
 */
@Service
public class NotificacaoService {

    private final List<Notificador> notificadores;

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = new ArrayList<>(notificadores);
        System.out.println("✅ NotificacaoService iniciado com " + 
                         notificadores.size() + " notificadores");
    }

    public void adicionarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }

    public void removerNotificador(Notificador notificador) {
        notificadores.remove(notificador);
    }

    public void enviarNotificacoes(Pedido pedido) {
        System.out.println("\n🔔 ===== NOTIFICAÇÕES =====");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("--------------------------");
        
        for (Notificador notificador : notificadores) {
            try {
                notificador.notificar(pedido);
            } catch (Exception e) {
                System.err.println("❌ Erro: " + e.getMessage());
            }
        }
        
        System.out.println("==========================\n");
    }
}