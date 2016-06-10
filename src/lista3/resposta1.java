
package lista3;

import java.util.Scanner;

public class resposta1 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.print("Digite Número 1 inteiro : ");
        int n1 = ent.nextInt();
    
    System.out.print("Digite Número 2 inteiro : ");
        int n2 = ent.nextInt();
            
    if (n1 > n2) {System.out.println("O mairo é o número n1 : " + n1);
               }
    else if (n1 < n2) {System.out.println("O maior é  o número n2 : " + n2);
             } 
    else {System.out.println("Os números são iguais");
               } 
      
    }

} 