# SimulaBancoTerminal

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring](https://img.shields.io/badge/Spring-5.3.22-brightgreen) ![Maven](https://img.shields.io/badge/Maven-4.0.0-orange)

O **SimulaBancoTerminal** é um sistema bancário simulado implementado em Java, projetado para ser executado em um terminal (console). Ele permite realizar operações básicas como criação de conta, depósito, saque e consulta de saldo. Este projeto utiliza o **Spring Framework** para gerenciamento de dependências e o **Maven** como ferramenta de build.

---

## Índice

- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Funcionalidades Implementadas](#funcionalidades-implementadas)
- [Observações Importantes](#observações-importantes)
- [Melhorias Futuras](#melhorias-futuras)
- [Licença](#licença)

---

## Visão Geral

O **SimulaBancoTerminal** é um projeto educacional que simula um sistema bancário básico. Ele foi desenvolvido para ajudar iniciantes a aprender conceitos de programação orientada a objetos, uso de frameworks como Spring e ferramentas como Maven. O sistema interage com o usuário por meio de um menu no terminal, permitindo operações simples como criação de conta, depósito, saque e consulta de saldo.

---

## Estrutura do Projeto

A estrutura atual do projeto é organizada da seguinte forma:
```
simula-banco-terminal/
└── SimulaBancoTerminal/
    └── demo/
        ├── src/main/java/com/example/bankingsystem/
        │   ├── BankAccount.java           # Classe que representa uma conta bancária.
        │   ├── BankingSystem.java         # Classe responsável por gerenciar contas e operações.
        │   └── TerminalController.java    # Classe principal com o menu interativo no terminal.
        ├── target/classes/com/example/bankingsystem/
        │   └── Arquivos .class compilados.
        └── pom.xml                        # Arquivo de configuração do Maven.
```

### Descrição dos Diretórios e Classes

1. **`src/main/java/com/example/bankingsystem/`**:
   - Contém o código-fonte principal do projeto.
   - Classes principais:
     - **`BankAccount`**: Representa uma conta bancária individual, com atributos como titular, número da conta e saldo. Métodos incluem `depositar`, `sacar` e `consultarSaldo`.
     - **`BankingSystem`**: Gerencia múltiplas contas e realiza operações como criar conta, depósito, saque e consulta de saldo.
     - **`TerminalController`**: Implementa o menu interativo no terminal, capturando entradas do usuário e delegando operações para as classes `BankAccount` e `BankingSystem`.

2. **`target/classes/com/example/bankingsystem/`**:
   - Contém os arquivos `.class` compilados pelo Maven.
   - Esse diretório é gerado automaticamente durante o build e não deve ser editado manualmente.

3. **`pom.xml`**:
   - Define as configurações do projeto Maven, incluindo dependências e plugins.

---

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter os seguintes requisitos instalados:

1. **Java 17**: O projeto foi desenvolvido usando a versão LTS do Java 17.
2. **Maven**: Ferramenta de build usada para compilar e executar o projeto.
3. **Git**: Para clonar o repositório (opcional).

---

## Como Executar o Projeto

### 1. Clone o Repositório
Clone o repositório para sua máquina local:
```bash
git clone https://github.com/pauloandresdf/simula-banco-terminal.git
cd simula-banco-terminal/SimulaBancoTerminal/demo
```
### 2. Compile o Projeto
Use o Maven para compilar o projeto:
```
mvn clean install
```
### 3. Execute o Projeto
Execute o programa diretamente via Maven:
```
mvn spring-boot:run
```
Ou execute o arquivo JAR gerado após o build:
```
java -jar target/demo-1.0-SNAPSHOT.jar
```
### 4. Interaja com o Sistema
Após iniciar o programa, siga as instruções exibidas no terminal para interagir com o sistema. As opções disponíveis incluem:

- `Criar conta.`
- `Depositar, sacar e consultar saldo.`
- `Sair do sistema.`

## Funcionalidades Implementadas
O sistema oferece as seguintes funcionalidades:

1.Criação de Conta :
- `Crie uma nova conta bancária informando o nome do titular e o número da conta.`
  
2.Operações Bancárias :
- `Depósito : Adicione dinheiro à sua conta.`
- `Saque : Retire dinheiro da sua conta, se houver saldo suficiente.`
- `Consulta de Saldo : Verifique o saldo atual da sua conta.`
  
3.Menu Interativo :
- `Um menu simples e intuitivo no terminal permite que o usuário escolha entre as opções disponíveis. A classe TerminalController é responsável por implementar esse menu.`

## Observações Importantes

1.Diretório Extra (demo) :
- `A presença do diretório SimulaBancoTerminal/demo/ pode causar confusão na estrutura do projeto. Para simplificar, considere mover o conteúdo de demo/src/main/java para a raiz do projeto ou configurar demo como um módulo Maven.`

2.Diretório target :
- `O diretório target é gerado automaticamente pelo Maven e contém os arquivos compilados. Ele não deve ser editado manualmente e deve ser ignorado no controle de versão (adicione /target/ ao .gitignore).`

3.Persistência de Dados :
- `Atualmente, os dados são armazenados apenas na memória volátil. Isso significa que todas as informações são perdidas ao encerrar o programa.`

4.Classe TerminalController :
- `Esta classe é o ponto de entrada do sistema e gerencia a interação com o usuário. Ela utiliza métodos das classes BankAccount e BankingSystem para realizar operações.`

## Melhorias Futuras

1.Persistência de Dados :
- `Implementar salvamento de contas em arquivos ou banco de dados (ex.: H2, MySQL).`

2.Histórico de Transações :
- `Registrar todas as operações realizadas (depósitos, saques, transferências).`

3.Transferência entre Contas :
- `Permitir que o usuário transfira valores entre contas diferentes.`

4.Interface Gráfica :
- `Migrar de terminal para uma interface gráfica usando JavaFX ou Swing.`

5.Testes Unitários :
- `Adicionar testes automatizados para garantir a qualidade do código.`

6.Autenticação :
- `Implementar login/senha para acessar contas.`

## Licença
Este projeto está licenciado sob a [MIT License](https://github.com/pauloandresdf/bank-account-manager/tree/main?tab=MIT-1-ov-file). 
Consulte o arquivo LICENSE para mais detalhes
