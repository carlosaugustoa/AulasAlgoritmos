//    Exercícios com Funções
//
// Faça um programa, com uma função que necessite de um argumento. A função
// retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se
// seu argumento for zero ou negativo.

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta4 {
    
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
            
        System.out.print("Digite um numero: ");
        int n1 = ent.nextInt();
        
        if (n1 > 0) 
            System.out.println( "P" );
            else 
                System.out.println( "N" ); 
        
    }
}