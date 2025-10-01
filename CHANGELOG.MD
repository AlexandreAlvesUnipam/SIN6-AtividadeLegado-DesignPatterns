## [1.1.0] - 2025-09-30

### Adicionado
- Interface `Notificador` para Strategy Pattern
- Métodos `adicionarNotificador()` e `removerNotificador()`
- WhatsAppService demonstrando extensibilidade
- Documentação JavaDoc completa
- Logs informativos com emojis

### Corrigido
- Acoplamento rígido entre NotificacaoService e serviços concretos
- Violação do princípio Open/Closed
- Impossibilidade de adicionar notificadores dinamicamente

### Modificado
- NotificacaoService implementa padrão Observer
- EmailService, SmsService e PushService implementam Notificador
- Injeção de dependência usa List<Notificador>

### Padrões GoF Aplicados
- **Observer Pattern**: NotificacaoService como Subject
- **Strategy Pattern**: Interface Notificador

### Princípios SOLID Aplicados
- Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion