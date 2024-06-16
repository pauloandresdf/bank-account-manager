package com.example.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    private List<BankAccount> contas;

    public BankingSystem() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(String titular, int numeroConta) {
        BankAccount conta = new BankAccount(titular, numeroConta);
        this.contas.add(conta);
        System.out.println("Conta criada com sucesso!");
    }

    public void depositar(int numeroConta, double valor) {
        BankAccount conta = encontrarConta(numeroConta);
        if (conta!= null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void sacar(int numeroConta, double valor) {
        BankAccount conta = encontrarConta(numeroConta);
        if (conta!= null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void consultarSaldo(int numeroConta) {
        BankAccount conta = encontrarConta(numeroConta);
        if (conta!= null) {
            conta.consultarSaldo();
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
    private BankAccount encontrarConta(int numeroConta) {
        for (BankAccount conta : this.contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}