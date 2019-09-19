
package letrad;

import java.text.DecimalFormat;
import java.util.Scanner;

public class letraH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sexo;
        double altura, peso;
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("Informe o seu sexo:");
        sexo = sc.nextLine();
        System.out.println("Informe a sua altura:");
        altura = sc.nextDouble();
        if((sexo.equals("masculino")) || (sexo.equals("Masculino")) || (sexo.equals("MASCULINO"))){
            peso = (72.7 * altura-58);
            System.out.println("O peso ideal masculino é "+dc.format(peso));     
        }else{
            peso = (62.1 * altura-44.7);
            System.out.println("O peso ideal feminino é "+ dc.format(peso));
        } 
        sc.close();
    } 
} 