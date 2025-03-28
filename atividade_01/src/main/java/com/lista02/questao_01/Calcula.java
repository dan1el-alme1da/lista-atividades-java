package com.lista02.questao_01;

public class Calcula {

    private double primeiroNumero;
    private double segundoNumero;
    private String operador;

    public Calcula(double primeiroNumero, double segundoNumero, String operador) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.operador = operador;
    }
    public double calcularSoma(){
        return primeiroNumero + segundoNumero;
    }

    public double calcularSubtracao(){
        return primeiroNumero - segundoNumero;
    }

    public double calcularMultiplicacao(){
        return primeiroNumero * segundoNumero;
    }

    public double calcularDivisao(){
        return primeiroNumero / segundoNumero;
    }
}
