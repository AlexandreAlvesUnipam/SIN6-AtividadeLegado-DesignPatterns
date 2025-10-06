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
- Cliente.java foi criado para melhor tratamento de informações e melhor lógica no código
- AbstractNotificacaoTemplate.java foi criada para gerir a regra de negócio por trás das notificações.
- NotificacaoStrategy.java, base para as três formas de notificação(template method).

### Corrigido
- NotificacaoApplication.java foi corrigida para aplicar os metodos e integrar os arquivos recem modificados.
- NotificacaoService.java para "setar" uma configuração padrão das notificações.
- Pedido.java, modificação na chamada do cliente, que agora virou um arquivo separado.
- PedidoService.java corrigido para aplicar regras no pedido, como valor minimo e cliente exigido.

### Modificado
- PushStrategy.java, SmsStrategy.java e EmailStrategy.java foram modificados para aplicarem o strategy method.