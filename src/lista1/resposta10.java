
package lista1;

import java.util.Scanner;

public class resposta10 {
   
    public static void main(String[] args) { 
        
// 10. Faça um Programa que peça a temperatura em graus Celsius, 
//     transforme e mostre em graus Farenheit
        
    Scanner ent = new Scanner(System.in);        
       
    System.out.print("Graus Celsius = ");
    float c = ent.nextFloat();
    //float f = c * 1.8 + 32;
    float f = c * 9 / 5 +32; 
    System.out.println( "Graus Farenheit = " + f );
   
            
        
        
        
        
        
        
        
        
    }
}
