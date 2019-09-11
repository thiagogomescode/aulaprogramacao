package com.unama;

import java.util.Scanner;

public class lista02letraG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Entre com um número: ");
        numero = sc.nextInt();
        if(numero % 2 == 1){
            System.out.println(numero+ " É um número Ímpar!");
        }else{
            System.out.println(numero + " É um número Par!");
        }
    }
}
