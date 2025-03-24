package com.lista01.questao_04;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro numero");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        double segundoNumero = scanner.nextDouble();

        double valor1 = primeiroNumero + segundoNumero;
        double valor2 = primeiroNumero - segundoNumero;
        double valor3 = primeiroNumero * segundoNumero;
        double valor4 = primeiroNumero / segundoNumero;
        double valor5 = primeiroNumero % segundoNumero;

        System.out.println("A soma dos valores é: "+valor1);
        System.out.println("A subtração dos valores é: "+valor2);
        System.out.println("A multiplicação dos valores é: "+valor3);
        System.out.println("A divisão dos valores é: "+valor4);
        System.out.println("A sobra da divisão é: "+valor5);
        
    }
}
