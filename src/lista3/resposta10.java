
package lista3;

import java.util.Scanner;

public class resposta10 {
    
    public static void main(String[] args) {  

     Scanner ent = new Scanner(System.in);
 
     System.out.print("Opções:\nM-Matutino\nV-Vespertino\nN-Noturno\nOpções: ");
     String turno;
        turno = ent.next();
     
      switch(turno){
        case "N": case "n" :
            System.out.println("Boa Noite !");
            break;
        case "M": case "m" :
            System.out.println("Bom Dia !");
            break;
        case "V": case "v" :
            System.out.println("Boa Tarde !");
            break;   
        default: 
            System.out.println("Valor Invalido !");
                   }
    }
}   
 