
package lista3;

import java.util.Scanner;

public class resposta2 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.print("Digite um Número: ");
        int n1 = ent.nextInt();
    
    if (n1 > 0) {System.out.println("O número è Positivo !!! ");
               }
    else if (n1 < 0) {System.out.println("O número é Negativo !!!");
             } 
    else {System.out.println("O número é zero");
               } 
     
    }

} 
