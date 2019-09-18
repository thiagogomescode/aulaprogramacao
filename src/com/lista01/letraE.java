package atividade;

import java.util.Scanner;

public class letraE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalvendas;
        System.out.println("Informe o valor total de vendas:");
        totalvendas = sc.nextDouble();
        totalvendas = totalvendas * 10 / 100;
        System.out.println("O valor da comissão é de R$:" + totalvendas);
        

    }
}
