package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.strategy.NotificacaoStrategy;
import com.exemplo.notificacao.factory.NotificacaoStrategyFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

class NotificacaoServiceTest {
    private NotificacaoStrategy email;
    private NotificacaoStrategy sms;
    private NotificacaoStrategy push;
    private NotificacaoStrategyFactory factory;
    private NotificacaoService service;
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        email = mock(NotificacaoStrategy.class, withSettings().name("emailService"));
        sms = mock(NotificacaoStrategy.class, withSettings().name("smsService"));
        push = mock(NotificacaoStrategy.class, withSettings().name("pushService"));
        factory = mock(NotificacaoStrategyFactory.class);
        service = new NotificacaoService(Arrays.asList(email, sms, push), factory);
        pedido = new Pedido("Cliente Teste", 100.0);
    }

    @Test
    void deveEnviarTodasAsNotificacoesPadrao() {
        service.enviarNotificacoes(pedido);
        verify(email).enviar(pedido);
        verify(sms).enviar(pedido);
        verify(push).enviar(pedido);
    }

    @Test
    void deveEnviarSomenteNotificacoesSelecionadas() {
        List<NotificacaoStrategy> selecionadas = Collections.singletonList(email);
        when(factory.getEstrategias(Collections.singletonList("emailService"))).thenReturn(selecionadas);
        service.enviarNotificacoesPorTipo(pedido, Collections.singletonList("emailService"));
        verify(email).enviar(pedido);
        verify(sms, never()).enviar(pedido);
        verify(push, never()).enviar(pedido);
    }
}
