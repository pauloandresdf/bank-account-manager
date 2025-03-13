package com.example.bankingsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private final String titular;
    private final int numeroConta;
    private double saldo;
    private final List<String> historico;
    private final DateTimeFormatter formatter;

    public Conta(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        registrarTransacao("Conta criada");
    }

    public void depositar(double valor) {
        this.saldo += valor;
        registrarTransacao(String.format("Depósito: R$ %.2f", valor));
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        registrarTransacao(String.format("Saque: R$ %.2f", valor));
    }

    private void registrarTransacao(String descricao) {
        String timestamp = LocalDateTime.now().format(formatter);
        historico.add(timestamp + " - " + descricao + " - Saldo: R$ " + String.format("%.2f", saldo));
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorico() {
        return new ArrayList<>(historico);
    }
}