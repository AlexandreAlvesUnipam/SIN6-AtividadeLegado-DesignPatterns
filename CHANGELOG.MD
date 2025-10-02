# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - DATA

### Adicionado
Implementação do padrão Observer: PedidoService publica OrderCreatedEvent e NotificacaoService escuta os eventos.

Implementação do padrão Strategy: criação da interface Notifier e refatoração dos serviços (EmailService, SmsService, PushService) para implementá-la.

Execução em modo CLI (NotificacaoApplication) permitindo criar pedidos via terminal.

### Corrigido
Removido acoplamento direto entre PedidoService e NotificacaoService.

Evitado código duplicado de envio de notificações.
### Modificado

NotificacaoService agora recebe uma lista de Notifier e envia notificações para todos os canais dinamicamente (Composite).

Estrutura reorganizada para suportar facilmente a adição de novos canais de notificação sem alterar código existente.