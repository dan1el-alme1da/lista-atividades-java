package com.lista01.questao_07;


import javax.swing.JOptionPane;

public class Resposta_07 {

    public static void main(String[] args) {
        String primeiro = JOptionPane.showInputDialog("Digite o primeiro número:");
        double primeiroNumero = Double.parseDouble(primeiro);

        String segundo = JOptionPane.showInputDialog("Digite o segundo número:");
        double segundoNumero = Double.parseDouble(segundo);

        String terceiro = JOptionPane.showInputDialog("Digite o segundo número:");
        double terceiroNumero = Double.parseDouble(terceiro);

        Calculadora calculadora = new Calculadora(primeiroNumero, segundoNumero, terceiroNumero);

        String resultados =  "Resultados:\n"+
                "Soma"+ calculadora.calcularSoma()+"\n"+
                "Média"+ calculadora.calcularMedia()+"\n";
        JOptionPane.showMessageDialog(null, resultados);
    }
}
