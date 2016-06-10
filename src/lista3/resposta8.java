
package lista3;

import java.util.Scanner;

public class resposta8 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
        System.out.print("Digite Produto 1 : ");
            String p1;
            p1 = ent.next();
        System.out.print("Digite Preço 1 : ");
            int n1 = ent.nextInt();
    
        System.out.print("Digite Produto 2 : ");
            String p2;
            p2 = ent.next();
        System.out.print("Digite Preço 2 : ");
            int n2 = ent.nextInt();
    
        System.out.print("Digite Produto 3 : ");
            String p3;
            p3 = ent.next();
        System.out.print("Digite Preço 3 : ");
            int n3 = ent.nextInt();   
    
            String barato = "";
        
            if (n1 < n2 && n1 < n3) {barato = p1;
               }
            if (n2 < n1 && n2 < n3) {barato = p2;
               } 
            if (n3 < n1 && n3 < n2) {barato = p3;
               } 
    
        System.out.println("O menor Preço é do PRODUTO : " + barato);
        
    }
}
