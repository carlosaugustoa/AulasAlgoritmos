
package lista3;

import java.util.Scanner;

public class resposta10 {
    
    public static void main(String[] args) {  

     Scanner ent = new Scanner(System.in);
 
     System.out.print("Informe o TURNO que você estuda: ");
     String turno;
        turno = ent.next();
     
      switch(turno){
        case "N": case "n" : case "NOTURNO" : case "noturno" :
            System.out.println("Boa Noite !");
            break;
        case "M": case "m" : case "MATUTINO" : case "matutino" :
            System.out.println("Bom Dia !");
            break;
        case "T": case "t" : case "VESPERTINO" : case "vespertino" :
            System.out.println("Boa Tarde !");
            break;   
        default: 
            System.out.println("Valor Invalido !");
                   }
    }
}   
 