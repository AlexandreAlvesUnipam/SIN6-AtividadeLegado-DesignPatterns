package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private ArrayList<IObserver> observers = new ArrayList<>();

    private Pedido pedido;

    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
        notificar();
    }

    public void notificar(){
        for(IObserver observer : observers){
            observer.enviaNotificacoes(pedido);
        }
    }
}
