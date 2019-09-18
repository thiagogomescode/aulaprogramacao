package atividade;

import java.util.Scanner;

public class letraH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario, reajuste, reajustado;
        System.out.println("Informe seu salário:");
        salario = sc.nextInt();
        System.out.println("Informe a porcentagem de reajuste:");
        reajuste = sc.nextInt();
        reajustado = (reajuste * salario) / 100;
        double novos = (salario + reajustado);
        System.out.println("Seu salário reajustado é de " + novos + " reais");

    }
}
