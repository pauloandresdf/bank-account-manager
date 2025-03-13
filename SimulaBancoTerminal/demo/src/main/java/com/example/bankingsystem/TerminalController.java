package com.example.bankingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Scanner;

@Controller
public class TerminalController {
    private final BankingSystem bankingSystem;
    private final Scanner scanner;

    @Autowired
    public TerminalController(BankingSystem bankingSystem) {
        this.bankingSystem = bankingSystem;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n===== SIMULA BANCO TERMINAL =====");
            System.out.println("Opções:");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Listar todas as contas");
            System.out.println("6 - Consultar histórico de transações");
            System.out.println("7 - Sair");
            System.out.println("================================");

            System.out.print("Digite a opção desejada: ");
            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido!");
                scanner.nextLine(); // Limpar buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarSaque();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    bankingSystem.listarContas();
                    break;
                case 6:
                    consultarHistorico();
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar o SimulaBancoTerminal!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }

    private void criarConta() {
        try {
            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            bankingSystem.criarConta(titular, numeroConta);
        } catch (Exception e) {
            System.out.println("Erro ao criar conta: Entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void realizarDeposito() {
        try {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite o valor a depositar: R$ ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            bankingSystem.depositar(numeroConta, valor);
        } catch (Exception e) {
            System.out.println("Erro ao realizar depósito: Entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void realizarSaque() {
        try {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite o valor a sacar: R$ ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            bankingSystem.sacar(numeroConta, valor);
        } catch (Exception e) {
            System.out.println("Erro ao realizar saque: Entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void consultarSaldo() {
        try {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            bankingSystem.consultarSaldo(numeroConta);
        } catch (Exception e) {
            System.out.println("Erro ao consultar saldo: Entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void consultarHistorico() {
        try {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            bankingSystem.consultarHistorico(numeroConta);
        } catch (Exception e) {
            System.out.println("Erro ao consultar histórico: Entrada inválida!");
            scanner.nextLine(); // Limpar buffer
        }
    }
}