//   Exercícios com Funções
//
// Desenha moldura. Construa uma função que desenhe um retângulo usando os
// caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros, linhas e
// colunas, sendo que o valor por omissão é o valor mínimo igual a 1 e o valor 
// máximo é 20. Se valores fora da faixa forem informados, eles devem ser
// modificados para valores dentro da faixa de forma elegante.



//
//Quadrado mágico. Um quadrado mágico é aquele dividido em linhas e colunas, com um número em cada posição e no qual a soma das linhas, colunas e diagonais é a mesma. Por exemplo, veja um quadrado mágico de lado 3, com números de 1 a 9:
//
//8  3  4 
//1  5  9
//6  7  2
//Elabore uma função que identifica e mostra na tela todos os quadrados mágicos com as características acima. Dica: produza todas as combinações possíveis e verifique a soma quando completar cada quadrado. Usar um vetor de 1 a 9 parece ser mais simples que usar uma matriz 3x3.

package ExerciciosComFuncoes;

import java.util.Random;

import java.util.Scanner;

public class resposta13 {

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