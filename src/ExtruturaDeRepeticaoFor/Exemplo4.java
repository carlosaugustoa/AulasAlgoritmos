package ExtruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exemplo4 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
    
    System.out.print("Digite um número : ");
    int numero = ent.nextInt();
    
    for (int i=1; i<10; i++) {
        
    System.out.println( numero + " * " + i + " = " + (i*numero));
      
      }
    
    
    }
}
