package com.lista01.questao_00;
import java.util.Scanner;
import java.math.*;

public class Resposta_00 {
    public static int Menu(){
        System.out.println("\n\n\t***************Menu**************");
        System.out.println("\t 1-Calcular Area de um Circulo.\n");
        System.out.println("\t 2-Calcular Area de um Triangulo.\n");
        System.out.println("\t 3-Calcular Area de um Quadrado.\n");
        System.out.println("\t 4-Calcular Area de um Retangulo.\n");
        System.out.println("\t 5-Sair.");
        System.out.println("\t*********************************\n\n");

        Scanner scan=new Scanner(System.in);
        System.out.print("Digite uma Opcao do Menu: ");
        int x= scan.nextInt();
        while(x<1 && x>5){
            System.out.print("Opcao Invalida.\n Digite novamente: ");
            x= scan.nextInt();
        }
        return x;
    }
    public static Double AreaCirculo(Double raio){

        Double AreaCirculo=raio*raio*Math.PI;
        return AreaCirculo;
    }
    public static Double AreaTriangulo(Double base, Double altura){

        Double AreaTriangulo=(base*altura)/2;
        return AreaTriangulo;
    }
    public static Double AreaQuadrado(Double lado){

        Double AreaQuadrado=lado*lado;
        return AreaQuadrado;
    }
    public static Double AreaRetangulo(Double largura,Double comprimento){

        Double AreaRetangulo=largura*comprimento;

        return AreaRetangulo;
    }

    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        int x=0;

        while(x!=5){
            x= Menu();

            if(x==1){
                System.out.print("\n\tDigite o Raio do Circulo: ");
                Double raio= scan.nextDouble();
                System.out.print("\n\tArea do Circulo eh: "+AreaCirculo(raio));
            }
            if(x==2){
                System.out.print("\n\tDigite a Altura do Triangulo: ");
                Double altura= scan.nextDouble();
                System.out.print("\tDigite a Base do Triangulo: ");
                Double base= scan.nextDouble();

                System.out.print("\n\tArea do Triangulo eh: "+AreaTriangulo(base,altura));
            }
            if(x==3){
                System.out.print("\n\tDigite a Medida do Lado do Quadrado: ");
                Double lado= scan.nextDouble();

                System.out.println("\n\tA Area do Quadrado eh: "+AreaQuadrado(lado));
            }
            if(x==4){
                System.out.print("\n\tDigite o Comprimento do Retangulo: ");
                Double comprimento= scan.nextDouble();
                System.out.print("\tDigite a Largura do Retangulo: ");
                Double largura= scan.nextDouble();

                System.out.print("\n\tA Area do Retangulo eh: "+AreaRetangulo (largura,comprimento));
            }
            if(x==5){

                System.out.println("\n\n******************Fim de Programa.******************\n\n");
                break;
            }
        }
    }
}



