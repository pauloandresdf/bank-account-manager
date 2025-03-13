package com.example.bankingsystem;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BankingSystem {
    private final Map<Integer, Conta> contas;

    public BankingSystem() {
        this.contas = new HashMap<>();
    }

    public void criarConta(String titular, int numeroConta) {
        if (contas.containsKey(numeroConta)) {
            System.out.println("Erro: Já existe uma conta com esse número!");
            return;
        }

        Conta novaConta = new Conta(titular, numeroConta);
        contas.put(numeroConta, novaConta);
        System.out.println("Conta criada com sucesso para " + titular + "!");
    }

    public void depositar(int numeroConta, double valor) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) return;

        if (valor <= 0) {
            System.out.println("Erro: O valor do depósito deve ser maior que zero!");
            return;
        }

        conta.depositar(valor);
        System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
    }

    public void sacar(int numeroConta, double valor) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) return;

        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero!");
            return;
        }

        if (conta.getSaldo() < valor) {
            System.out.println("Erro: Saldo insuficiente!");
            return;
        }

        conta.sacar(valor);
        System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
    }

    public void consultarSaldo(int numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) return;

        System.out.printf("Saldo da conta %d: R$ %.2f\n", numeroConta, conta.getSaldo());
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas no sistema.");
            return;
        }

        System.out.println("\n===== LISTA DE CONTAS =====");
        for (Conta conta : contas.values()) {
            System.out.printf("Conta: %d | Titular: %s | Saldo: R$ %.2f\n",
                    conta.getNumeroConta(), conta.getTitular(), conta.getSaldo());
        }
        System.out.println("==========================");
    }

    public void consultarHistorico(int numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) return;

        List<String> historico = conta.getHistorico();
        if (historico.isEmpty()) {
            System.out.println("Não há transações registradas para esta conta.");
            return;
        }

        System.out.println("\n===== HISTÓRICO DE TRANSAÇÕES =====");
        System.out.println("Conta: " + numeroConta + " | Titular: " + conta.getTitular());
        for (String transacao : historico) {
            System.out.println(transacao);
        }
        System.out.println("===================================");
    }

    private Conta buscarConta(int numeroConta) {
        if (!contas.containsKey(numeroConta)) {
            System.out.println("Erro: Conta não encontrada!");
            return null;
        }
        return contas.get(numeroConta);
    }
}