package atividade;

import java.util.Scanner;

public class letraI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorcompra, desconto, calculo, valordesconto;
        System.out.println("Informe o valor da compra:");
        valorcompra = sc.nextDouble();
        System.out.println("Informe o percentual do desconto:");
        desconto = sc.nextDouble();
        calculo = (desconto * valorcompra) / 100;
        valordesconto = (valorcompra - calculo);
        System.out.println("O valor é pago " + valordesconto);

    }
}
