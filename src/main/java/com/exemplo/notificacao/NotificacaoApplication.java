package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.EmailService;
import com.exemplo.notificacao.service.NotificacaoService;
import com.exemplo.notificacao.service.PedidoService;
import com.exemplo.notificacao.service.PushService;
import com.exemplo.notificacao.service.SmsService;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private NotificacaoService notificacaoService =  new NotificacaoService();

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos ===");

        EmailService emailService = new EmailService();
        PushService pushService = new PushService();
        SmsService smsService = new SmsService();
        PedidoService pedidoService = new PedidoService(notificacaoService);

        notificacaoService.addObserver(emailService);
        notificacaoService.addObserver(pushService);
        notificacaoService.addObserver(smsService);
        
        Pedido pedido1 = new Pedido("João", 150.0);
        Pedido pedido2 = new Pedido("Carlos", 120.0);
        Pedido pedido3 = new Pedido("Maria", 130.0);

        pedidoService.criarPedido(pedido1.getCliente(), pedido1.getValor());
        
        System.out.println("=== Fim da execução ===");
    }
}
