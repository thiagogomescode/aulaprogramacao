
package letraj08;

import java.util.Scanner;

public class LetraJ08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;
        System.out.println("---------------");
        System.out.println("Menu de opçõe:");
        System.out.println("---------------");
        System.out.println("1.SOMAR DOIS NÚMEROS.");
        System.out.println("2.RAIZ QUADRADA DE UM NÚMERO.");
        System.out.println("Informe sua opção:");
        opc = sc.nextLine();
        if(opc.equals("1")){
            System.out.println("Informe o primeiro valor:");
            int v1 = sc.nextInt();
            System.out.println("Informe o segundo valor:");
            int v2 = sc.nextInt();
            int valort = (v1 + v2);
            System.out.println("--------------------------");
            System.out.println("O resultado da soma é:"+valort);
            System.out.println("--------------------------");
        }else if(opc.equals("2")){
            System.out.println("Informe o valor:");
            int v1 = sc.nextInt();
            System.out.println("-----------------------------");
            System.out.println("A raiz quadrada do valor é:"+Math.sqrt(v1));
            System.out.println("-----------------------------");
            
        }
    }
    
}
