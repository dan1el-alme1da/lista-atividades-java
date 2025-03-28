package com.lista02.questao_02;

public class Resposta_02 {
    public static void main(String[] args) {
        String nome = "Daniel";
        String fone = "34333322445";
        double renda = 800.00;

        Cliente cliente = new Cliente(nome, fone, renda);
        cliente.Cliente();
        cliente.getId();
        System.out.println(cliente);

    }

}
