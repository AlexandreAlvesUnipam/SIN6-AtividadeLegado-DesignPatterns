package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.NotificacaoService;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private NotificacaoService notificacaoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos ===");

        Pedido pedido1 = new Pedido("João", 150.0);
        Pedido pedido2 = new Pedido("Maria", 320.0);
        Pedido pedido3 = new Pedido("Lucas", 42.0);

        notificacaoService.enviarNotificacoes(pedido1);
        notificacaoService.enviarNotificacoes(pedido2);
        notificacaoService.enviarNotificacoes(pedido3);

        System.out.println("=== Fim da execução ===");
    }
}
