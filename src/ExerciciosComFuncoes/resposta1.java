//    Exercícios com Funções

//    Faça um programa para imprimir:
//    1
//    2   2
//    3   3   3
//    .....
//    n   n   n   n   n   n  ... n
//    para um n informado pelo usuário. Use uma função que receba um valor n inteiro
//    e imprima até a n-ésima linha./*
 
package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta1 {
    
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
            
        System.out.print("Digite um numero: ");
        int n = ent.nextInt();
  
        for (int i = 1; i <= n; i ++ ) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(i + "  ");
                
            }
            
            System.out.println("");
            
        }


    }
}

