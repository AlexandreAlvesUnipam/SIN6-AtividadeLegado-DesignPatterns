package com.exemplo.notificacao;

import com.exemplo.notificacao.service.PedidoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    private final PedidoService pedidoService;

    public NotificacaoApplication(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Sistema de Notificação de Pedidos (CLI) ===");
        System.out.println("Digite 'sair' para encerrar.");

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Cliente: ");
                String cliente = sc.nextLine();
                if (cliente == null || cliente.isBlank() || cliente.equalsIgnoreCase("sair")) break;

                System.out.print("Valor: ");
                String v = sc.nextLine();
                if (v == null || v.equalsIgnoreCase("sair")) break;

                double valor;
                try {
                    valor = Double.parseDouble(v.replace(',', '.'));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Tente novamente.");
                    continue;
                }

                pedidoService.criarPedido(cliente, valor);
            }
        }

        System.out.println("=== Fim da execução ===");
    }
}
