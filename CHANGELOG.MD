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
- Introduzida a interface `Notificador` para desacouplar os tipos de notificação, permitindo futuras extensões de forma flexível (Padrão Strategy).

### Corrigido
- Corrigido o alto acoplamento da classe `NotificacaoService` com os serviços concretos de notificação (E-mail, SMS, Push).
- Resolvida a violação do Princípio Aberto/Fechado (Open/Closed Principle), agora é possível adicionar novos notificadores sem alterar o código existente.

### Modificado
- `NotificacaoService` foi refatorado para operar com uma lista genérica de `Notificador`, eliminando suas dependências diretas das classes concretas.
- As classes `EmailService`, `SmsService` e `PushService` foram refatoradas para `EmailNotificador`, `SmsNotificador` e `PushNotificador`, respectivamente, implementando a nova interface.

## [1.2.0] - 2025-10-01

### Adicionado
- Adicionado o framework de logging SLF4J para um registro de eventos mais robusto e configurável.

### Corrigido
- Sem correções

### Modificado
- As classes de notificação (`EmailNotificador`, `SmsNotificador`, `PushNotificador`) foram modificadas para usar `logger.info()` em vez de `System.out.println()`.