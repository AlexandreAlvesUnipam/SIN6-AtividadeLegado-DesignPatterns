package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface IObserver{

    void enviaNotificacoes(Pedido pedido);

}