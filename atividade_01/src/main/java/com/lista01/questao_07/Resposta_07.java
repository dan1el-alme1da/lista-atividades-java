package com.lista01.questao_07;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" digite tres numeros inteiros");
        double primeiroNumero = scanner.nextDouble();
        double segundoNumero = scanner.nextDouble();
        double terceiroNumero = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(primeiroNumero, segundoNumero, terceiroNumero);

        System.out.println("\n--------------RESULTADOS---------------");
        System.out.println("A soma dos numeros digitados é: "+calculadora.calcularSoma());
        System.out.println("A Média dos numeros digitados é: "+calculadora.calcularMedia());
    }
}
class Calculadora{
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
