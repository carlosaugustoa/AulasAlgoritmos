//    Exercícios com Funções
//
// respota3
// Faça um programa, com uma função que necessite de três argumentos, e que
// forneça a soma desses três argumentos.
// package lista6;

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta3 {
    
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
            
        System.out.print("Digite um numero: ");
        int n1 = ent.nextInt();
        
        System.out.print("Digite um numero: ");
        int n2 = ent.nextInt();
        
        System.out.print("Digite um numero: ");
        int n3 = ent.nextInt();
          
        System.out.println((n1+n2+n3));
    
    }
}