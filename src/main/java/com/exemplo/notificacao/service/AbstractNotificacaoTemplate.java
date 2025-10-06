package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public abstract class AbstractNotificacaoTemplate implements NotificacaoStrategy {

    @Override
    public final void enviar(Pedido pedido, String mensagem) {
        enviarNotificacao(pedido, mensagem);
    }

    public final void enviarNotificacao(Pedido pedido, String mensagem) {
        validarPedido(pedido);
        prepararMensagem(pedido, mensagem);
        enviarMensagemEspecifica(pedido, mensagem);
        finalizarEnvio(pedido);
    }

    private void validarPedido(Pedido pedido) {
        if (pedido == null || pedido.getCliente() == null) {
            throw new IllegalArgumentException("Pedido ou cliente inválido");
        }
    }

    private void prepararMensagem(Pedido pedido, String mensagem) {
        System.out.println("Preparando mensagem para: " + pedido.getCliente().getNome());
    }

    protected abstract void enviarMensagemEspecifica(Pedido pedido, String mensagem);

    private void finalizarEnvio(Pedido pedido) {
        System.out.println("Notificação enviada para: " + pedido.getCliente().getNome());
    }
}