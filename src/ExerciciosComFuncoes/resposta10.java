//   Exercícios com Funções
//
// Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador lança
// um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
// tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na
// primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira
// jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo
// agora é continuar jogando os dados até tirar este número novamente. Você
// perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.ata 
// com mês por extenso. Construa uma função que receba uma data no formato

package ExerciciosComFuncoes;

import java.util.Random;

import java.util.Scanner;

public class resposta10 {
    
    public static void main(String[] args) {
	
        Scanner ent = new Scanner(System.in);
        
            float joga = 0;
            int cont = 0;
            String jogo = "inicio";
            int soma = 0;
            
        while ( jogo.equalsIgnoreCase("inicio") ) {       
        
                cont++;
                       
            System.out.print("Jogue os Dados digite 0 !!! ");
                jogo = ent.next();
        
                Random dado1 = new Random();
                soma = dado1.nextInt(12)-1;
                
            if (soma < 2 ){
                soma = 2;
            }                  
            System.out.print("  " + soma );
                
            if (cont == 1 ){
                if (soma == 7 || soma == 11) {
                System.out.println("  Vencedor Você tirou " + soma + " pontos!!!");
                break;
                }
            }
            if (cont == 1 ){
                if (soma == 2 || soma == 3 || soma == 12) {
                System.out.println(" Craps você Perdeu !!!");
                break;
                }    
            } 
                joga = joga + soma;
            if (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10) {
              
                System.out.println("  Crédito de: " + soma + " pontos!!!");
            }         
            if (cont >= 1 ){
                if (soma == 7 ) {
                System.out.println(" Você PERDEU O JOGO !!! mais ainda tirou !!! " + joga);
                break;
                }    
            }
            if (cont >= 1 ){
                System.out.println(" Continue jogando Você tem " + joga + " pontos");
            }
            
                jogo = "inicio";
                soma = 0;
            System.out.println("");
        }        
    }    
}
