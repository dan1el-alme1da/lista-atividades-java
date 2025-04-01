package com.lista_02.questao_01;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ClienteArray clienteArray = new ClienteArray(1000);

        int opcao;
        do {
            System.out.println("\n------------MENU------------");
            System.out.println("1 - inserir novo cliente");
            System.out.println("2 - listar clientes");
            System.out.println("3 - sair da aplicação");

            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("\n--- INSERIR NOVO CLIENTE ---");

                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Digite o email do cliente: ");
                    double renda = scanner.nextDouble();

                    Cliente novoCliente = new Cliente(nome, cpf, renda);
                    clienteArray.insere(novoCliente);

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    Cliente[] clientes = clienteArray.listaClientes();

                    if (clientes.length == 0) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("Total de clientes: " + clientes.length);
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while (opcao != 3);

    }
}
