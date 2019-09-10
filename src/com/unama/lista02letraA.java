package com.unama;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lista02letraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copias;
        System.out.println("Informe a quantidade de cópias: ");
        copias = sc.nextInt();
        double totalpago;
        if (copias <= 100) {
            totalpago = copias * 0.20;
        }else{
            totalpago = copias * 0.20;
        }
        System.out.println("O valor pago é R$" + totalpago);

    }
    }
