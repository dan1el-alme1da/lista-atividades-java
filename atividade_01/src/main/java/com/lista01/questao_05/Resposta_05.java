package com.lista01.questao_05;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor da base do retangulo");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura do retangulo");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2* base + 2* altura;

        System.out.println("A área do retângulo é: "+area+", e o perímetro é:"+perimetro);
    }
}
