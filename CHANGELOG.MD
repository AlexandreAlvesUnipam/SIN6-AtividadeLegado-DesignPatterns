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
- Implementação do **Builder Pattern** na classe `Pedido`, permitindo criação flexível e extensível de pedidos.
- Criação do pacote `factory` com a classe `PedidoFactory` utilizando o **Factory Method** para centralizar a lógica de criação de pedidos.
- Interface `Notificador` para unificar os canais de notificação (Email, SMS, Push) aplicando o **Observer Pattern**.
- Novo fluxo de negócio em `PedidoService`, responsável por processar pedidos e delegar notificações.

### Corrigido
- Redução do acoplamento no `NotificacaoService`, que agora depende apenas da lista de `Notificador` (injeção de dependências pelo Spring).

### Modificado
- `NotificacaoApplication` atualizado para utilizar `PedidoFactory` e `PedidoService` em vez de instanciar e notificar pedidos diretamente.
- `NotificacaoService` refatorado para seguir o **Observer Pattern**, removendo dependências diretas de `EmailService`, `SmsService` e `PushService`.
- `EmailService`, `SmsService` e `PushService` alterados para implementar a interface `Notificador`.
- `PedidoService` atualizado para utilizar `PedidoFactory` na criação de pedidos.

## [1.2.0] - 2025-10-07

### Adicionado
- Inclusão de **logs (Logger)** substituindo `System.out.println`, melhorando o monitoramento e a rastreabilidade da aplicação.
- Estrutura inicial adicionada para futura implementação do **Strategy Pattern**, permitindo escolher dinamicamente o tipo de notificação.

### Corrigido
- Correção no uso do construtor de `Pedido` ao integrar com `PedidoFactory`.

### Modificado
- `PedidoService` atualizado para utilizar `Logger` do `SLF4J`.
- `NotificacaoService` revisado para facilitar futura extensão com o **Strategy Pattern**.
