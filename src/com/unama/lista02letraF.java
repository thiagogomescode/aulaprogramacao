package com.unama;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class lista02letraF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1;
        int n2;
        System.out.println("Entre com o primeiro número: ");
        N1 = sc.nextInt();
        System.out.println("Entre com o segundo número: ");
        n2 = sc.nextInt();
        if (N1<n2) {
            System.out.println("O número "+ n2 + " é maior que "+ N1+"!");

        }else {
            System.out.println("O número "+ N1 + "é maior que "+n2+"!");

        }

    }
}
