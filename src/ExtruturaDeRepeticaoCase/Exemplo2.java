
package ExtruturaDeRepeticaoCase;

import java.util.Scanner;

public class Exemplo2 {
 
 public static void main(String[] args){
 
    Scanner ent = new Scanner(System.in);
    
    String escolha = ent.next();   
    
    //System.out.println("## OPCÇOES ##\nGabriel\nCarlos\nCaio");
     
    switch(escolha){
        case "Gabriel":
            System.out.println("Cabra bom esse garoto");
            break;
        case "Carlos":
            System.out.println("Sujeito sério e concentrado");
            break;
        case "Caio":
            System.out.println("Gente fina e honesta");
            break;
        default: 
            System.out.println("Você [e azedp e não gosta de gente");
    }
   
        
        
        
        
  }
}
