

package lista1;

import java.util.Scanner;

public class resposta6 {
   
    public static void main(String[] args) { 
        
//   6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.     
        
    Scanner ent = new Scanner(System.in);        
       
    System.out.println("Digite o raio de um Circulo : ");
        
        float raio = ent.nextFloat();
        
        float pi = (float) 3.1415;
        
        float area = pi * raio * raio;
        
        System.out.println("Àrea do Círculo é : " + area );
            
        
        
    }
}
