package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exemplo.notificacao.service.EmailStrategy;
import com.exemplo.notificacao.service.NotificacaoStrategy;
import com.exemplo.notificacao.service.PushStrategy;
import com.exemplo.notificacao.service.SmsStrategy;
import com.exemplo.notificacao.model.Cliente;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {


    public static void main(String[] args){

        System.out.println("=== Sistema de Notificação de Pedidos ===");

        Cliente c1 = new Cliente("Murilo");
        Cliente c2 = new Cliente("Ana");
        Cliente c3 = new Cliente("Carlos");

        Pedido p1 = new Pedido(c1, 150.0);
        Pedido p2 = new Pedido(c2, 320.0);
        Pedido p3 = new Pedido(c3, 89.9);

        // Definindo notificadores
         NotificacaoStrategy email = new EmailStrategy();
         NotificacaoStrategy sms = new SmsStrategy();
         NotificacaoStrategy push = new PushStrategy();

        // Enviando notificações
        email.enviar(p1, "Pedido recebido por email.");
        sms.enviar(p2, "Pedido recebido por SMS.");
        push.enviar(p3, "Pedido recebido por push notification.");
    }

    @Override
    public void run(String... args) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    }



