package com.unama;

import java.util.Scanner;

public class letraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Informe o seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe sua idade:");
        idade = sc.nextInt();
        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos: ");


    }
}
