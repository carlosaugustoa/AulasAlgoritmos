//   Exercícios com Funções
//
// Faça uma função que informe a quantidade de dígitos de um determinado número
// inteiro informado.

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta8 {
    
   public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
            String num = ent.next();
        
            int qtl = num.length();
         
        System.out.print("Este número trem: " + qtl + " carateres");
                
    }
}
