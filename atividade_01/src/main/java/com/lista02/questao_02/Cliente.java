package com.lista02.questao_02;

public class Cliente {
    private int id;
    private String nome;
    private String fone;
    private double renda;

    public Cliente(String nome, String fone, double renda) {
        this.nome = nome;
        this.fone = fone;
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
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
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
                ", fone='" + fone + '\'' +
                ", renda=" + renda +
                '}';
    }
}
