package com.unama;

import java.util.Scanner;
public class letraB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero;
        double dobro;
        System.out.println("Informe o numero: ");
        numero = sc.nextDouble();
        dobro = numero * 2;
        System.out.println("o dobro é :" + dobro);


    }
}