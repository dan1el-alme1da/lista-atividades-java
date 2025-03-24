package com.lista01.questao_02;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um numero inteiro");
        double numero = scanner.nextDouble();

        numero = numero * 2;

        System.out.println("O dobro do numero digitado é: "+numero);
    }
}
