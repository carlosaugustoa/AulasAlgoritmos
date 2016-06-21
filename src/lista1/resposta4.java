package lista1;

import java.util.Scanner;

public class resposta4 {
   
    public static void main(String[] args) { 
        
//   4. Faça um Programa que peça as 4 notas bimestrais e mostre a média     
        
    Scanner ent = new Scanner(System.in);
                    
        System.out.println("nota n1: ");
        float a = ent.nextFloat();
        System.out.println("nota n2: ");
        float b = ent.nextFloat();
        System.out.println("nota n3: ");
        float c = ent.nextFloat();
        System.out.println("nota n4: ");
        float d = ent.nextFloat();           
        
        float media = (a+b+c+d)/4;    
        
        System.out.println("A média é " + media);

        
        
        
        
        
        
        
        
        
    }
}