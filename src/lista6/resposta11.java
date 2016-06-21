//    Exercícios com Funções
//
//    Faça um programa para imprimir:
//    1
//    2   2
//    3   3   3
//    .....
//    n   n   n   n   n   n  ... n
//    para um n informado pelo usuário. Use uma função que receba um valor n inteiro
//    e imprima até a n-ésima linha./*
 
package lista6;

import java.util.Scanner;

public class resposta11 {
    
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
            
            System.out.print("Digite um numero: ");
                int numero = ent.nextInt();
  
        for (int i = 0 ; i <= numero; i ++ ) {
            
            for (int j = 0 ; j <= i; i ++ ){
            
                System.out.print(i);
                System.out.println(i + i);  
            }
        }


    }
}
