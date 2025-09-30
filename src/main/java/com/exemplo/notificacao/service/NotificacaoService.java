package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private final EmailService emailService;
    private final SmsService smsService;
    private final PushService pushService;

    public NotificacaoService(EmailService emailService, SmsService smsService, PushService pushService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }

    public void enviarNotificacoes(Pedido pedido) {
        emailService.notificar(pedido);
        smsService.notificar(pedido);
        pushService.notificar(pedido);
    }
}
