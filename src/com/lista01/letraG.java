package atividade;

import java.util.Scanner;

public class letraG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento, largura, metroquadrado;
        System.out.println("Informe o comprimento da sala:");
        comprimento = sc.nextDouble();
        System.out.println("Informe a largura da sala:");
        largura = sc.nextDouble();
        metroquadrado = (comprimento * largura);
        System.out.println("A sala de aula tem:" + metroquadrado + " metros quadrados!!!");

    }
}
