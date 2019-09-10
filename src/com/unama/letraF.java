package com.unama;

import java.util.Scanner;

public class letraF {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Quantidade;
        double Preço;
        double Total;
        System.out.println("Informe a quantidade: ");
        Quantidade = sc.nextInt();
        System.out.println("Informe o preço: ");
        Preço = sc.nextDouble();
        Total = Quantidade * Preço;
        System.out.println("O total a ser pago é: " + Total);



    }

}
