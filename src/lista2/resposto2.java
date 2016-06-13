package lista2;

import java.util.Scanner;

public class resposto2 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.print("Digite a Altura da Pessoa: ");
        
        float altura = ent.nextFloat();
        float peso = (float) ((72.7 * altura) - 58);
        
    System.out.print("Seu peso é : " + peso );    
    
    
    }

} 