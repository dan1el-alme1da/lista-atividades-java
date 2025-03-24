package com.lista01.questao_03;

import java.util.Locale;
import java.util.Scanner;

public class Resposta_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o ano atual");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano de nascimento");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: "+idade+" anos");
    }
}
