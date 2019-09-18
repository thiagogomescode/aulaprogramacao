package atividade;

import java.util.Scanner;

public class letraD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, perimetro, raio;
        System.out.println("Informe o valor do raio: ");
        raio = sc.nextInt();
        area = Math.PI * raio * raio;
        perimetro = (2 * Math.PI * raio);
        System.out.println("O perímetro é:" + perimetro + " e a área é:" + area);

    }
}
