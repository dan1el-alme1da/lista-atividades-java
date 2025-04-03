package com.lista_02.questao_01;

import javax.swing.*;

public class Calcula {

    private double primeiroNumero, segundoNumero;

    private String operador;

    public Calcula(double primeiroNumero, double segundoNumero, String operador) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.operador = operador;
    }

    public double calcularSoma() {
        return primeiroNumero + segundoNumero;
    }

    public double calcularSubtracao() {
        return primeiroNumero - segundoNumero;
    }

    public double calcularMultiplicacao() {
        return primeiroNumero * segundoNumero;
    }

    public double calcularDivisao() {
        return primeiroNumero / segundoNumero;
    }

    public static void main(String[] args) {



            double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            String operador = (JOptionPane.showInputDialog("Digite um operador:"));

            Calcula calcula = new Calcula(primeiroNumero, segundoNumero, operador);

            switch (operador) {
                case "+":
                    calcula.calcularSoma();
                    String resultadoSoma= "Resultados:\n" +
                            "Soma: " + calcula.calcularSoma();
                    JOptionPane.showMessageDialog(null, resultadoSoma);
                    break;

                case "_":
                    calcula.calcularSubtracao();
                    String resultadoSubtracao = "Resultados:\n" +
                            "Subtração: " + calcula.calcularSubtracao();
                    JOptionPane.showMessageDialog(null, resultadoSubtracao);
                    break;

                case "*":
                    calcula.calcularMultiplicacao();
                    String resultadoMultiplicacao = "Resultados:\n" +
                            "Multiplicação: " + calcula.calcularMultiplicacao();
                    JOptionPane.showMessageDialog(null, resultadoMultiplicacao);
                    break;

                case "/":
                    calcula.calcularDivisao();
                    String resultadoDivisao = "Resultados:\n" +
                            "Divisão: " + calcula.calcularDivisao();
                    JOptionPane.showMessageDialog(null, resultadoDivisao);
                    break;
            }
    }
}

