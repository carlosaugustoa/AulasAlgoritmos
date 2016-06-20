package lista5;

import java.util.Scanner;

public class resposta10 {

    public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);
    
    System.out.print("Digite um Números : ");
            int n1 = ent.nextInt();
    System.out.print("Digite um Números : ");
            int n2 = ent.nextInt();        
            
    for (int i=n1+1; i<n2; i++) { 
        System.out.print(i + " ");
    }
    }
}
