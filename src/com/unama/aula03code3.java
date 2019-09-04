package com.unama;

import java.util.Scanner;

public class aula03code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();
        if (idade<=10){
            System.out.println("Sua categoria é Infantil");
        }else if(idade>10 && idade<=17) {
            System.out.println("Sua categoria é Juvenil");
        }else{
            System.out.println("Sua categoria é Senior");

        }
    }
}
