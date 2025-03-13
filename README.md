# SimulaBancoTerminal

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring](https://img.shields.io/badge/Spring-5.3.22-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-orange)
![Licença](https://img.shields.io/badge/Licença-MIT-green)

<p align="center">
  <img src="https://via.placeholder.com/150?text=SimulaBanco" alt="Logo SimulaBanco"/>
</p>

**SimulaBancoTerminal** é um sistema bancário simulado desenvolvido em Java, que opera através de uma interface de terminal. Este projeto demonstra a implementação de operações bancárias básicas utilizando o Spring Framework e padrões de projeto orientados a objetos.

## 📋 Índice

- [Recursos](#-recursos)
- [Tecnologias](#-tecnologias)
- [Arquitetura](#-arquitetura)
- [Instalação e Execução](#-instalação-e-execução)
- [Guia de Uso](#-guia-de-uso)
- [Testes](#-testes)
- [Roadmap](#-roadmap)
- [Contribuições](#-contribuições)
- [Licença](#-licença)

## 🚀 Recursos

O sistema oferece as seguintes funcionalidades:

- **Gerenciamento de Contas**
  - Criação de contas bancárias com validação de dados
  - Identificação por número e titular

- **Operações Financeiras**
  - Depósitos com validação de valores
  - Saques com verificação de saldo disponível
  - Consulta de saldo atualizado

- **Recursos Adicionais**
  - Listagem de todas as contas cadastradas
  - Histórico de transações com data e hora
  - Interface interativa via terminal

## 💻 Tecnologias

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java 17**: Linguagem de programação principal
- **Spring Framework 5.3.22**: Para injeção de dependências e gerenciamento de componentes
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências
- **JUnit**: Framework para testes unitários

## 🏗️ Arquitetura

A aplicação segue uma arquitetura baseada em componentes:

```
simula-banco-terminal/
├── src/main/java/com/example/bankingsystem/
│   ├── BankAccount.java         # Entidade que representa uma conta bancária
│   ├── BankingSystem.java       # Serviço que gerencia as operações bancárias
│   ├── TerminalController.java  # Controlador para interface com o usuário
│   └── Main.java                # Classe principal com configuração Spring
└── pom.xml                      # Configuração do projeto Maven
```

### Componentes Principais

#### 1. BankAccount
Representa uma conta bancária individual com métodos para operações financeiras e rastreamento de histórico.

#### 2. BankingSystem
Gerencia o conjunto de contas no sistema, fornecendo validações e regras de negócio para as operações.

#### 3. TerminalController
Controla a interface com o usuário e direciona as requisições para o BankingSystem.

## 🔧 Instalação e Execução

### Pré-requisitos
- Java 17 ou superior
- Maven 3.8.x ou superior
- Git (opcional)

### Passos para Instalação

1. **Clone o repositório**
   ```bash
   git clone https://github.com/pauloandresdf/simula-banco-terminal.git
   cd simula-banco-terminal
   ```

2. **Compile o projeto**
   ```bash
   mvn clean package
   ```

3. **Execute a aplicação**
   ```bash
   java -jar target/simula-banco-terminal-1.0.0.jar
   ```

## 📝 Guia de Uso

Ao iniciar a aplicação, você terá acesso a um menu interativo com as seguintes opções:

1. **Criar conta**
   - Informe o nome do titular e número da conta
   - O sistema validará se o número já existe

2. **Depositar**
   - Informe o número da conta e valor a depositar
   - Valores negativos serão rejeitados

3. **Sacar**
   - Informe o número da conta e valor a sacar
   - O sistema verificará se há saldo suficiente

4. **Consultar saldo**
   - Exibe informações detalhadas da conta
   - Mostra saldo atual e data de criação

5. **Listar todas as contas**
   - Exibe todas as contas cadastradas no sistema
   - Mostra número, titular e saldo de cada conta

6. **Consultar histórico de transações**
   - Exibe o histórico de todas as operações realizadas na conta
   - Cada transação é registrada com data e hora

7. **Sair**
   - Encerra a aplicação

## 📈 Roadmap

Futuras melhorias planejadas para o projeto:

- **Persistência de Dados**
  - Implementação de armazenamento em banco de dados
  - Suporte a H2 para desenvolvimento e MySQL/PostgreSQL para produção

- **Novas Funcionalidades**
  - Transferência entre contas
  - Pagamento de contas com código de barras
  - Simulação de rendimentos

- **Segurança**
  - Autenticação de usuários com senha
  - Níveis de acesso (cliente/administrador)
  - Criptografia de dados sensíveis

- **Interface Gráfica**
  - Migração para aplicação web com Spring Boot e Thymeleaf
  - Alternativa em JavaFX para aplicação desktop

## 👥 Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/nova-funcionalidade`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

---

Desenvolvido por [Paulo Andre](https://github.com/pauloandresdf) &copy; 2025
