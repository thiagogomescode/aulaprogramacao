package letrad;

import java.util.Scanner;

public class letraD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Informe à medida do lado 1:");
        lado1 = sc.nextInt();
        System.out.println("Informe à medida do lado 2:");
        lado2 = sc.nextInt();
        System.out.println("Informe à medida do lado 3:");
        lado3 = sc.nextInt();
        if((lado1 == lado2) && (lado3 == lado2)){
            System.out.println("É um Triângulo Equilátero!!!");
        }else if((lado1 != lado2) && (lado1 != lado3)){ 
                System.out.println("É um Triângulo Escaleno!!!");         
            }else{
                    System.out.println("É um Triângulo Isósceles!!!");
            }
            sc.close();
        }
    }   

