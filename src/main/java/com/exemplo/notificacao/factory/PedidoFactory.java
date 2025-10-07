package com.exemplo.notificacao.factory;

import org.springframework.stereotype.Component;
import com.exemplo.notificacao.model.Pedido;

import java.util.UUID;

@Component
public class PedidoFactory {

    public Pedido criarPedido(String cliente, double valor) {
        return new Pedido.Builder()
                .id(UUID.randomUUID().toString())
                .cliente(cliente)
                .valor(valor)
                .status("CRIADO")
                .build();
    }
}
