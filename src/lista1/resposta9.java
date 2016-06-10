package lista1;
import java.util.Scanner;

public class resposta9 {
   
    public static void main(String[] args) { 
        
// 9. Faça um Programa que peça a temperatura em graus Farenheit,
//    transforme e mostre a temperatura em graus Celsius. 

//    C = (5 * (F-32) / 9).      
        
    Scanner ent = new Scanner(System.in);        
       
    System.out.println("Graus Farenheit = ");
    float faren = ent.nextFloat();
    
    float celsi = ( 5 * (faren-32) / 9 );
    System.out.println("Graus Celsius = " + celsi);
   
            
    }
}
