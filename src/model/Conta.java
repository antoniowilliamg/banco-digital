package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected double saldo;
    private Cliente cliente;
    private List<String> historico = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add("Depósito: R$ " + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            historico.add("Saque: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            historico.add("Transferência para " + destino.getCliente().getNome() + ": R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência!");
        }
    }

    public void emprestar(double valor) {
        saldo += valor;
        historico.add("Empréstimo concedido: R$ " + valor);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirHistorico() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }

    public abstract void imprimirExtrato();
}
