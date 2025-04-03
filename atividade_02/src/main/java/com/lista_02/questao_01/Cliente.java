package com.lista_02.questao_01;

public class Cliente {
    private int id;
    private String nome, cpf;
    private double renda;



    public Cliente(String nome, String cpf, double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
    }

    public void Cliente(){

    }

    public int getId() {


        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return cpf;
    }

    public void setFone(String fone) {
        this.cpf = fone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fone='" + cpf + '\'' +
                ", renda=" + renda +
                '}';
    }
}
