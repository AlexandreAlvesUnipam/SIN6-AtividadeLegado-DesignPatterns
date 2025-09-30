## [1.1.0] - 2025-09-30

### Adicionado
- Interface `Notificador` para desacoplar os serviços de notificação, aplicando o padrão Observer.

### Corrigido
- Corrigido erro de compilação relacionado à versão do Java no ambiente de desenvolvimento.
- Corrigidos erros de sintaxe e nomes de arquivos.

### Modificado
- `NotificacaoService` foi refatorado para gerenciar uma lista de `Notificador`, eliminando o acoplamento direto com os serviços.
- `EmailService`, `SmsService` e `PushService` agora implementam a interface `Notificador`.
- `NotificacaoApplication` ajustada para usar o `PedidoService` como ponto de entrada.