## [1.1.0] - 2025-10-05

### Adicionado
- Interface `Notificador` para Strategy Pattern
- Métodos `adicionarNotificador()` e `removerNotificador()`
- WhatsAppService demonstrando extensibilidade
- Documentação JavaDoc completa

### Corrigido
- Acoplamento rígido entre NotificacaoService e serviços concretos
- Violação do princípio Open/Closed

### Modificado
- NotificacaoService implementa padrão Observer
- EmailService, SmsService e PushService implementam Notificador

### Padrões GoF Aplicados
- **Observer Pattern**: NotificacaoService como Subject
- **Strategy Pattern**: Interface Notificador