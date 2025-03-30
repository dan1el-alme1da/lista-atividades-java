package com.lista02.questao_01;

import javax.swing.*;

public class Resposta_01 {
    public static void main(String[] args) {


        String primeiro = JOptionPane.showInputDialog("Digite o primeiro número:");
        double primeiroNumero = Double.parseDouble(primeiro);

        String segundo = JOptionPane.showInputDialog("Digite o segundo número:");
        double segundoNumero = Double.parseDouble(segundo);

        String operador = JOptionPane.showInputDialog("Digite o operador desejado (+, -, *, /): ");

        Calcula calcula = new Calcula(primeiroNumero, segundoNumero, operador);


        double resultado = 0;
        switch (operador){
            case "+":
                resultado = calcula.calcularSoma();
                break;
            case "-":
                resultado = calcula.calcularSubtracao();
                break;
            case "*":
                resultado = calcula.calcularMultiplicacao();
                break;
            case "/":
                resultado = calcula.calcularDivisao();
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
