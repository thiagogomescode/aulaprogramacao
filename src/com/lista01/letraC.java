package atividade;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area;
        int base, altura;
        System.out.println("Informe a base do triângulo: ");
        base = sc.nextInt();
        System.out.println("Informe a altura do triângulo: ");
        altura = sc.nextInt();
        area = (base * altura) / 2;
        System.out.println("A àrea do triângulo é:" + area);

    }

}
