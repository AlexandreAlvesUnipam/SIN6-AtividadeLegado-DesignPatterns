package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
public class EmailStrategy extends AbstractNotificacaoTemplate {
    @Override
    protected void enviarMensagemEspecifica(Pedido pedido, String mensagem) {
        System.out.println("Enviando Email para " + pedido.getCliente().getNome() + " | Mensagem: " + mensagem);
    }
}