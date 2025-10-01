package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.exemplo.notificacao.service.EmailStrategy;
import com.exemplo.notificacao.service.NotificacaoService;
import com.exemplo.notificacao.service.PushStrategy;
import com.exemplo.notificacao.service.SmsStrategy;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {


    public static void main(String[] args){

        System.out.println("=== Sistema de Notificação de Pedidos ===");

        // Criando pedidos
        Pedido pedido1 = new Pedido("Murilo", 100);
        Pedido pedido2 = new Pedido("David", 200);
        Pedido pedido3 = new Pedido("Joyce", 1500);

        // Serviço de notificação
        NotificacaoService service = new NotificacaoService();

        // Pedido 1 -> Notificação por Email
        service.setStrategy(new EmailStrategy());
        service.enviarNotificacao(pedido1, "Seu pedido no valor de: " + pedido1.getValor() + " foi confirmado!");

        // Pedido 2 -> Notificação por SMS
        service.setStrategy(new SmsStrategy());
        service.enviarNotificacao(pedido2, "Seu pedido no valor de: " + pedido2.getValor() + " saiu para entrega!");

        // Pedido 3 -> Notificação por Push
        service.setStrategy(new PushStrategy());
        service.enviarNotificacao(pedido3, "Seu pedido no valor de: " + pedido3.getValor
        () + " foi entregue!");

        System.out.println("=== Fim da execução ===");
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    }

        
    
