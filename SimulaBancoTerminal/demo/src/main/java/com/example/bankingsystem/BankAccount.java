package com.example.bankingsystem;

public class BankAccount {
    private String titular;
    private int numeroConta;
    private double saldo;

    public BankAccount(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}