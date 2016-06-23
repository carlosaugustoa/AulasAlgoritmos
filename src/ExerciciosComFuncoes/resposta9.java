//   Exercícios com Funções
//
// Reverso do número. Faça uma função que retorne o reverso de um número inteiro
// informado. Por exemplo: 127 -> 721.

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta9 {
    
   public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String num = ent.next(),new_num = "";
        int qtd = num.length();
        
        for (int i = (qtd-1); i >= 0; i--) {
            new_num += num.charAt(i);
        }
                
        System.out.println("Novo Numero: " + new_num);
        
    }
}
