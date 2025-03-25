package com.lista01.questao_04;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        double primeiroNumero;
        do {
            System.out.println("Digite o primeiro numero (deve ser positivo e diferente de zero):");
            primeiroNumero = scanner.nextDouble();
            if (primeiroNumero <= 0) {
                System.out.println("Erro: O primeiro número não pode ser zero ou negativo. Tente novamente.");
            }
        } while (primeiroNumero <= 0);


        double segundoNumero;
        do {
            System.out.println("Digite o segundo numero (deve ser positivo e diferente de zero):");
            segundoNumero = scanner.nextDouble();
            if (segundoNumero <= 0) {
                System.out.println("Erro: O segundo número não pode ser zero ou negativo. Tente novamente.");
            }
        } while (segundoNumero <= 0);


        double resultadoSoma = primeiroNumero + segundoNumero;
        double resultadoSubtracao = primeiroNumero - segundoNumero;
        double resultadoMultiplicacao = primeiroNumero * segundoNumero;
        double resultadoDivisao = primeiroNumero / segundoNumero;
        double resultadoSobra = primeiroNumero % segundoNumero;


        System.out.println("A soma dos valores é: " + resultadoSoma);
        System.out.println("A subtração dos valores é: " + resultadoSubtracao);
        System.out.println("A multiplicação dos valores é: " + resultadoMultiplicacao);
        System.out.println("A divisão dos valores é: " + resultadoDivisao);
        System.out.println("A sobra da divisão é: " + resultadoSobra);
    }
}