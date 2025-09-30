# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 30-09-2025

### Adicionado
- Interface 'ObservadorPedido' para padronizar notificações.
- Suporte a múltiplos tipos de de notificadores (email, sms, push) através do padrão Observer.
- Métodos em 'NotificacaoService' para registrar e remover observadores dinamicamente.

### Corrigido
 Nenhum problema corrigido nesta versão.

### Modificado
- 'NotificacaoService' refatorado para atuar como "Subject" do padrão Observer.
- 'EmailService', 'SmsService' e 'PushService' refatorados para implementar a interface 'ObservadorPedido'
- 'PedidoService' agora apenas cria pedidos e delega a notificação ao 'NotificacaoService'