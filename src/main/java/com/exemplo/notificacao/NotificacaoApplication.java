package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.PedidoService;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos ===");

        pedidoService.criarPedido("João", 150.0);
        pedidoService.criarPedido("Maria", 320.0);
        pedidoService.criarPedido("Carlos", 80.0);

        System.out.println("=== Fim da execução ===");
    }
}
