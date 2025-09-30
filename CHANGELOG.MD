# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-09-30

### Adicionado
- Implementação do padrão Observer para o sistema de notificações de pedidos.
- Criação da interface `IObserver` para padronizar os serviços de notificação.
- Serviços de notificação implementados como observers: `EmailService`, `SmsService` e `PushService`.
- Classe `NotificacaoService` agora gerencia observers e notifica todos ao receber um novo pedido.

### Corrigido
- Correção de problemas de package na interface `IObserver` para compatibilidade com os serviços.

### Modificado
- Refatoração do fluxo de notificação para utilizar o padrão Observer, tornando o sistema mais flexível e desacoplado.