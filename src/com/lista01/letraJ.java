package atividade;

import java.util.Scanner;

public class letraJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorreal, valordolar, dolares;
        System.out.println("Dê o valor em reais:");
        valorreal = sc.nextDouble();
        System.out.println("Dê a cotação do dólar:");
        valordolar = sc.nextDouble();
        dolares = (valorreal / valordolar);
        System.out.println("O valor convertido para dólar é:" + dolares + "dólares !!!");

    }
}
