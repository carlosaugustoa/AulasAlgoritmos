

package lista1;

import java.util.Scanner;

public class resposta7 {
   
    public static void main(String[] args) { 
        
// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre
//    o dobro desta área para o usuário.     
        
    Scanner ent = new Scanner(System.in);        
       
    System.out.println("Digite o tamnaho do lado da Quadrado : ");

        float lado = ent.nextFloat();
        float area = (lado*lado);
        float dobro = (area*2);
    
        System.out.println("A área do quadrado é : " + dobro );
      
    }
}