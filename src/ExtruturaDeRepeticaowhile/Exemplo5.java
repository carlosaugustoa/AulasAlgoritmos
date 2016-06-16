package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    int opcao = 0;
    int cand1 = 0;
    int cand2 = 0;
    int cand3 = 0;
    int branco = 0;
    int nulo = 0;    
    
    while (opcao !=99999){
    
        //Entrada de dados
        System.out.print("Candidato 1 - Digite <1>:\nCandidato 2 - Digite <2>:\nCandidato 3 - Digite <3>:\nVoto NULO   - Digite <0>:\nVoto BRANCO - Digite <9>: \n\nDIGITE SUA OPCAO: ");
        opcao = ent.nextInt();
        //if (opcao != && opcao != 2 && opcao != 3 && opcao != 0 && opcao !=9 && opcao != 99999){
        //}        }
        if (opcao == 1){
            cand1++;
        }
        if (opcao == 2){
            cand2++;
        }
        if (opcao == 3){
            cand3++;
        }
        if (opcao == 0){
            nulo++;
        }
        if (opcao == 9){
            branco++;
            }    
    }
        System.out.println("\nCandidato 1 teve: " + cand1 + " votos\nCandidato 2 teve: " + cand2
                + " votos\nCandidato 3 teve: " + cand3 + " votos\nVotos NULO  teve: " + nulo + 
                " votos\nVoto BRANCO teve: " + branco + " votos");
    
    
               
  }
}

