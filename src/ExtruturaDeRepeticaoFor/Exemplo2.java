
package ExtruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exemplo2 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
    
    int numero = 0, soma = 0;
    
    for (int i=1; i<=5; i++ ) {
        
//   i++  i+=2 i**3 i-=2
        
        
        System.out.print("Digite o número " + i + ": ");
        
        numero = ent.nextInt();
        
        soma += numero;
    }    
        
        System.out.println("Soma: " + soma);
    
    
    }
}
