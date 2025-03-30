package com.lista01.questao_07;

public class Calculadora {

    private double primeiroNumero;
    private double segundoNumero;
    private double terceiroNumero;

    public Calculadora(double primeiroNumero, double segundoNumero, double terceiroNumero){
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.terceiroNumero = terceiroNumero;
    }
    public double calcularSoma(){
        return primeiroNumero + segundoNumero + terceiroNumero;
    }

    public double calcularMedia(){
        return (primeiroNumero + segundoNumero + terceiroNumero)/3;
    }
}
