package com.example.bankingsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public void start() {
    while (true) {
        System.out.println("Opções:");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Consultar saldo");
        System.out.println("5 - Sair");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o titular da conta: ");
                String titular = scanner.next();
                System.out.print("Digite o número da conta: ");
                int numeroConta = scanner.nextInt();
                bankingSystem.criarConta(titular, numeroConta);
                break;
            case 2:
                System.out.print("Digite o número da conta: ");
                int numeroContaDepositar = scanner.nextInt();
                System.out.print("Digite o valor a depositar: ");
                double valorDepositar = scanner.nextDouble();
                bankingSystem.depositar(numeroContaDepositar, valorDepositar);
                break;
            case 3:
                System.out.print("Digite o número da conta: ");
                int numeroContaSacar = scanner.nextInt();
                System.out.print("Digite o valor a sacar: ");
                double valorSacar = scanner.nextDouble();
                bankingSystem.sacar(numeroContaSacar, valorSacar);
                break;
            case 4:
                System.out.print("Digite o número da conta: ");
                int numeroContaConsultar = scanner.nextInt();
                bankingSystem.consultarSaldo(numeroContaConsultar);
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                return;
            default:
                System.out.println("Opção inválida!");
        }
    }
}