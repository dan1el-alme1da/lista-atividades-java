package com.lista01.questao_06;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor da base");
        double cateto1 = scanner.nextDouble();

        System.out.println("Digite da altura");
        double cateto2 = scanner.nextDouble();

        double valor1 = cateto1 * cateto1;
        double valor2 = cateto2 * cateto2;
        double somaCatetos = valor1 + valor2;
        double hipotenusa = Math.sqrt(somaCatetos);

        System.out.println("A hipotenusa dos valores dos cateos obtidos é: "+hipotenusa);

    }
}
