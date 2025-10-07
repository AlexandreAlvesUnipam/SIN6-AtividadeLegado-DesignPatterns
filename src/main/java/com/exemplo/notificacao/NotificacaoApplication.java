package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.exemplo.notificacao.service.PedidoService;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(NotificacaoApplication.class);

    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("=== Sistema de Notificação de Pedidos Iniciado ===");

        pedidoService.criarPedido("João", 150.0);
        pedidoService.criarPedido("Maria", 320.0);
        pedidoService.criarPedido("Carlos", 80.0);

        logger.info("=== Fim da execução ===");
    }
}
