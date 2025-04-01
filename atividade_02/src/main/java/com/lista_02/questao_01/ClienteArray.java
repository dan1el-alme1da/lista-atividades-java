package com.lista_02.questao_01;

import com.lista_02.questao_01.Cliente;



public class ClienteArray {

    private Cliente[] clientes;
    private int quantidadeClientes;

    public ClienteArray(){
        this(100);
    }

    public ClienteArray(int tamanho) {
        this.clientes = new Cliente[tamanho];
        this.quantidadeClientes = 0;
    }
    public void insere(Cliente cliente){
        if(quantidadeClientes < clientes.length){
            clientes[quantidadeClientes] = cliente;
            quantidadeClientes++;
        }
    }
}
