package letrad;
import java.util.Scanner;

public class letraI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nmedia;
        System.out.println("Informe a primeira nota:");
        nota1 = sc.nextFloat();
        System.out.println("Informe a segunda nota:");
        nota2 = sc.nextFloat();
        System.out.println("Informe a terceira nota:");
        nota3 = sc.nextFloat();
        nmedia = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média é:"+nmedia+" pontos");
        if((nmedia>= 7) && (nmedia <=10)){
            System.out.println("Aluno Aprovado!");
        }else if((nmedia>= 3) && (nmedia <7)){
           System.out.println("O aluno está de Exame! .... A média que precisa ser tirada é:"+(10-nmedia));
        }else{
           System.out.println("Aluno Reprovado");
        }
        sc.close();
    }
 }