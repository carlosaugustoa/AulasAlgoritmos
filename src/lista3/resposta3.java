
package lista3;

import java.util.Scanner;

public class resposta3 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o SEXO da Pessoa (M-MASCULINO ou F-FEMININO): ");
        String sex = ent.next();
        
        switch(sex){
        case "M": case "m" : case "MASCULINO" : case "masculino" :
            System.out.println("M-Masculino");
            break;
        case "F": case "f" : case "FEMININO" : case "feminino" :
            System.out.println("F-Feminino");
            break;
        default: 
            System.out.println("Sexo Inválido");
                  }
  
    }
}