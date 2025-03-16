package main;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import service.Banco;

import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("\n--- Menu do Banco Digital ---");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Solicitar Empréstimo");
            System.out.println("6. Consultar Saldo");
            System.out.println("7. Imprimir Extrato");
            System.out.println("8. Listar Clientes");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do Cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Tipo de conta (1 - Corrente, 2 - Poupança): ");
                    int tipoConta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Cliente cliente = new Cliente(nome, cpf);
                    if (tipoConta == 1) {
                        banco.criarConta(new ContaCorrente(cliente));
                    } else if (tipoConta == 2) {
                        banco.criarConta(new ContaPoupanca(cliente));
                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o CPF do Cliente: ");
                    String cpfDeposito = scanner.nextLine();
                    Conta contaDeposito = banco.buscarContaPorCpf(cpfDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Valor do Depósito: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                        contaDeposito.imprimirExtrato();
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 3:
                    System.out.print("Informe o CPF do Cliente: ");
                    String cpfSaque = scanner.nextLine();
                    Conta contaSaque = banco.buscarContaPorCpf(cpfSaque);
                    if (contaSaque != null) {
                        System.out.print("Valor do Saque: R$ ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha
                        contaSaque.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                        contaSaque.imprimirHistorico();
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("CPF do remetente: ");
                    String cpfOrigem = scanner.nextLine();
                    Conta contaOrigem = banco.buscarContaPorCpf(cpfOrigem);
                    if (contaOrigem != null) {
                        System.out.print("CPF do destinatário: ");
                        String cpfDestino = scanner.nextLine();
                        Conta contaDestino = banco.buscarContaPorCpf(cpfDestino);
                        if (contaDestino != null) {
                            System.out.print("Valor da transferência: R$ ");
                            double valorTransferencia = scanner.nextDouble();
                            scanner.nextLine(); // Consumir a quebra de linha
                            contaOrigem.transferir(contaDestino, valorTransferencia);
                            System.out.println("Transferência realizada com sucesso!");
                            System.out.println("Histórico do Remetente:");
                            contaOrigem.imprimirHistorico();
                            System.out.println("Histórico do Destinatário:");
                            contaDestino.imprimirHistorico();
                        } else {
                            System.out.println("Conta do destinatário não encontrada!");
                        }
                    } else {
                        System.out.println("Conta do remetente não encontrada!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o CPF do Cliente: ");
                    String cpfEmprestimo = scanner.nextLine();
                    Conta contaEmprestimo = banco.buscarContaPorCpf(cpfEmprestimo);
                    if (contaEmprestimo != null) {
                        System.out.print("Valor do Empréstimo: R$ ");
                        double valorEmprestimo = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha
                        contaEmprestimo.emprestar(valorEmprestimo);
                        System.out.println("Empréstimo concedido com sucesso!");
                        contaEmprestimo.imprimirExtrato();
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 6:
                    System.out.print("Informe o CPF do Cliente: ");
                    String cpfSaldo = scanner.nextLine();
                    Conta contaSaldo = banco.buscarContaPorCpf(cpfSaldo);
                    if (contaSaldo != null) {
                        System.out.println("Saldo atual: R$ " + contaSaldo.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 7:
                    System.out.print("Informe o CPF do Cliente: ");
                    String cpfExtrato = scanner.nextLine();
                    Conta contaExtrato = banco.buscarContaPorCpf(cpfExtrato);
                    if (contaExtrato != null) {
                        contaExtrato.imprimirExtrato();
                        contaExtrato.imprimirHistorico();
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 8:
                    banco.listarClientes();
                    break;

                case 9:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
