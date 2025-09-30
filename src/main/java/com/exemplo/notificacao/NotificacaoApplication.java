package com.exemplo.notificacao;

import com.exemplo.notificacao.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Sistema de Notificação de Pedidos (cenários complexos) ===");

        // Básicos
        pedidoService.criarPedido("João", 150.0);
        pedidoService.criarPedido("Maria", 320.0);

        // Valores “limite”
        pedidoService.criarPedido("ValorZero", 0.0);
        pedidoService.criarPedido("ValorAlto", 999_999.99);

        // Nomes com caracteres especiais/emoji
        pedidoService.criarPedido("Ana-Clara 🚀", 87.45);

        // Muitos pedidos em sequência
        for (int i = 1; i <= 10; i++) {
            pedidoService.criarPedido("Lote-" + i, i * 10.0);
        }

        // (Opcional) Carga paralela simples
        java.util.stream.IntStream.range(0, 20).parallel()
            .forEach(i -> pedidoService.criarPedido("Paralelo-" + i, i + 0.99));

        System.out.println("=== Fim da execução ===");
    }
}
