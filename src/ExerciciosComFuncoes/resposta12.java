//   Exercícios com Funções
//
// Embaralha palavra. Construa uma função que receba uma string como parâmetro e
// devolva outra string com os carateres embaralhados. Por exemplo: se função
// receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra 
// combinação possível, de forma aleatória. Padronize em sua função que todos os
// caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de
// como foram digitados.

package ExerciciosComFuncoes;

import java.util.Random;

import java.util.Scanner;

public class resposta12 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
    
        System.out.print("Digite uma Palavra: ");
            String palavra = ent.next();
            palavra.toLowerCase();
            String new_palavra = "";
            int qtd = palavra.length();
            
        for (int i = (qtd-1); i >= 0; i--) {
            new_palavra += palavra.charAt(i);
        }
                
        System.out.println("Nova Palavra: " + new_palavra.toUpperCase());
        System.out.println("Nova Palavra: " + new_palavra.toLowerCase());
       
        
    }    
}
