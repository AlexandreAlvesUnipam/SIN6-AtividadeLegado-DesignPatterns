package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.NotificacaoService;
import com.exemplo.notificacao.service.PedidoService;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    // Usa PedidoService para criar pedidos.
    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos ===");

        // Cria os pedidos.
        // Automaticamente todos os observadores são avisados.
        pedidoService.criarPedido("Kaio Jorge", 19.0);
        pedidoService.criarPedido("Matheus Pereira", 10.0);
        pedidoService.criarPedido("Gabriel Barbosa", 9.0);

        System.out.println("=== Fim da execução ===");
    }
}