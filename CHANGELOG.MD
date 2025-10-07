# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 06/10/2025

### Adicionado 
###  Aplicar padrão Strategy explicitamente
- Criar uma interface comum (ex: `Notificador`) para todos os tipos de notificação
- Usar polimorfismo para tratar notificadores

###  Implementar padrão Factory Method
- Criar uma fábrica para instanciar notificadores dinamicamente
- Facilitar a inclusão de novos tipos de notificação sem alterar o fluxo principal


###  Adicionar testes unitários
- Criar testes para os serviços de notificação
- Testar o fluxo principal de pedidos

###  Melhorar documentação e comentários
- Comentar o código explicando onde cada padrão foi aplicado

### Corrigido

## Pontos Fracos Identificados
- Acoplamento direto entre classes de serviço de notificação e o fluxo principal
- Baixa extensibilidade para adicionar novos tipos de notificação
- Ausência de testes unitários
- Falta de documentação sobre padrões aplicados

### Modificado
###  Implementar padrão Observer
- Permitir que múltiplos serviços de notificação sejam notificados automaticamente quando um pedido é criado
- Desacoplar ainda mais o fluxo de notificação

### Implementar padrão Decorator
- Permitir adicionar funcionalidades extras (ex: log, auditoria) às notificações sem alterar as classes principais