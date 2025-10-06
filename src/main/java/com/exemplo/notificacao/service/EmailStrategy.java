package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
public class EmailStrategy implements NotificacaoStrategy {
    @Override
    public void enviar(Pedido pedido, String mensagem) {
        System.out.println("Enviando Email para " 
            + pedido.getCliente().getNome() 
            + " | Valor: R$" + pedido.getValor() 
            + " | Mensagem: " + mensagem);
    }
}