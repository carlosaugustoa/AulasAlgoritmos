
package lista3;

import java.util.Scanner;

public class resposta5 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    //if (n1 < || n1 > 10) {
      //  System.out.println("Nota Inválida!");
      //  System.exit(0);
    //}
    
    System.out.print("nota n1: ");
        int a = ent.nextInt();
    System.out.print("nota n2: ");
        int b = ent.nextInt();
                          
        float media = (a+b)/2;
        
    if (media == 10 ) {
        System.out.println("APROVADO COM DISTINÇÃO:");           
    } else if (media <10 && media >= 7 ) {
        System.out.println("Este ALUNO eatá APROVADO : ");
    } else {
        System.out.println("Este ALUNO está REPROVADO : ");
                } 
    }
}
     
