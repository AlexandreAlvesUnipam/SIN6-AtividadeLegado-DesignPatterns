# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-06

### Adicionado
- Interface Notificador (contrato para canais de notificação).
- EmailService, SmsService e PushService agora implementam Notificador.
- NotificacaoService recebe List injetada pelo Spring e dispara notificações iterando sobre a lista.
- Isolamento e menor acoplamento entre lógica de envio e serviço que orquestra notificações.
### Corrigido

### Modificado