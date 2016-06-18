package lista5;

import java.util.Scanner;

public class Exemplo5 {
    
    public static void main(String [] args) { 
    
    Scanner ent = new Scanner(System.in);
        
        int a = 2;
        int b = 1;
           
    while (a < b){
        System.out.print("Informe a População: ");
            a = ent.nextInt();
        
        System.out.print("Informe a População: ");
            b = ent.nextInt();
           
            int ab = a + (a * b);
        System.out.println(a + " " + b + "aumenta em ");
    }  
                       
    } 
}
