//    Exercícios com Funções

//    Faça um programa para imprimir:
//    1
//    1   2
//    1   2   3
//    .....
//    1   2   3   ...  n
//     para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
 
package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta2 {
    
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
            
        System.out.print("Digite um numero: ");
        int n = ent.nextInt();
  
        for (int i = 1; i <= n; i ++ ) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j + "  ");
                
            }
            
            System.out.println("");
            
        }


    }
}
