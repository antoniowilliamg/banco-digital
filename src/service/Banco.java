package service;

import model.Cliente;
import model.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void criarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() +
                    " | CPF: " + conta.getCliente().getCpf());
        }
    }

    public Conta buscarContaPorCpf(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }
}
