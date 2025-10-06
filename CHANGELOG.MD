# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-05

### Adicionado

- Padrão Strategy para serviços de notificação com interface NotificacaoStrategy

- Padrão Observer para comunicação entre pedidos e notificações

- Interface PedidoObserver para observadores de pedidos

- Classe NotificacaoObserver que implementa o padrão Observer

- Métodos para notificações seletivas por tipo (enviarNotificacao e enviarNotificacoesSelecionadas)

- Mapeamento dinâmico de estratégias de notificação no NotificacaoService

- Método para criação de pedidos com notificações customizadas

### Corrigido

- Acoplamento forte entre NotificacaoService e serviços concretos

- Violação do OCP - Agora é possível adicionar novos tipos de notificação sem modificar classes existentes

- Dificuldade de teste através da introdução de interfaces e injeção de dependência

- Falta de flexibilidade na configuração de notificações

### Modificado

- Refatoração completa do NotificacaoService para usar padrão Strategy

- Modificação da classe Pedido para suportar padrão Observer

- Atualização do PedidoService para trabalhar com observers

- Alteração dos serviços de notificação (EmailService, SmsService, PushService) para implementar NotificacaoStrategy

- Melhoria na NotificacaoApplication para usar o PedidoService refatorado