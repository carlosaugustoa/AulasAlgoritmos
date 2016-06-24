//   Exercícios com Funções
//
// Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
// lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada,
// você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na
// primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira 
// jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo
// agora é continuar jogando os dados até tirar este número novamente. Você
// perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.

//Data com mês por extenso. Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. Opcionalmente, valide a data e retorne NULL caso a data seja inválida.
//
//Embaralha palavra. Construa uma função que receba uma string como parâmetro e devolva outra string com os carateres embaralhados. Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra combinação possível, de forma aleatória. Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados.
//
//Desenha moldura. Construa uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros, linhas e colunas, sendo que o valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. Se valores fora da faixa forem informados, eles devem ser modificados para valores dentro da faixa de forma elegante.
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

public class resposta10 {

    public static void main(String[] args) {
	
        Scanner ent = new Scanner(System.in);
        
            int randon1 = 0;
            int randon2 = 0;
            float joga = 0;
            int cont = 0;
            
        while (randon1 != 0 && randon2 != 0 ) {       
        
            cont++;
        
            System.out.println("Jogue os Dados !!!");
            int jogo = 0;
        
            int random1 = 1 + (int) (Math.random() * 6);
            System.out.println(random1);
        
            int random2 = 1 + (int) (Math.random() * 6);
            System.out.println(random2);
    
            float soma = (randon1 + randon2);
        
            if (cont == 1 ){
                if (soma == 7 || soma == 11) {
                System.out.println(soma + "Vencedor");
                break;
                }
            }
            if (cont == 1 ){
                if (soma == 2 || soma == 3 || soma == 12) {
                System.out.println(soma + "Craps você Perdeu !!!");
                break;
                }    
            }
            
            if (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10) {
                joga = joga + soma;
                System.out.println("Você ganhou : " + soma + " pontos ficando com total de : " + joga !!!");
            }         
            
    
        }
    }        
}    

