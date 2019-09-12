package com.unama;

import java.util.Scanner;

public class lista02letraE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faltas;
        float media;
        System.out.println("Entre com o número de faltas: ");
        faltas = sc.nextInt();
        System.out.println("Entre com a média do aluno: ");
        media = sc.nextFloat();
        if(faltas>40){
            System.out.println("Aluno está Reprovado!");
        }else if (media<6) {
            System.out.println("Aluno está de Recuperação");
        }else{
            System.out.println("Aluno está Aprovado");
        }
    }
}
