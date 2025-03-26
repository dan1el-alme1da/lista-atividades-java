package com.lista01.questao_07;


import javax.swing.JOptionPane;

public class Resposta_07 {

    public static void main(String[] args) {

        double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));


        Calculadora calculadora = new Calculadora(primeiroNumero, segundoNumero, terceiroNumero);

        String resultados =  "Resultados:\n"+
                "Soma"+ calculadora.calcularSoma()+"\n"+
                "Média"+ calculadora.calcularMedia()+"\n";
        JOptionPane.showInputDialog(null, resultados);
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
