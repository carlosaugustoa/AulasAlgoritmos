package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
           
            // Variáveis Auxiliares
            int opc = 0;
            int mai = 0; int men = 0; int mei = 0; 
            int nul = 0; int bra = 0;
            int c1 = 0; int c2 = 0; int c3 = 0;
            String venc = ""; String perd = ""; String meio = "";                          
        
        // Entrada de Votos Eleição     
        while (opc != 99999){
            System.out.print("Candidato 1 - Digite <1>:\nCandidato 2 - Digite <2>:"
                    + "\nCandidato 3 - Digite <3>:\nVoto NULO   - Digite <0>:\nVoto BRANCO "
                    + "- Digite <9>: \n\nDIGITE SUA OPCAO: ");
                opc = ent.nextInt();
            
            switch(opc){
                case 1 :
                    c1++;
                    break;
                case 2 :
                    c2++;
                    break;
                case 3 :
                    c3++;
                    break;
                case 0 :
                    nul++; 
                case 9 :
                    bra++;
                case 99999 :
                    break;
                default: 
                    System.out.println("Voto inválido !!!");
            } 
        }   
            // Definindo Maior e Menor Voto
            if (c1 > c2) {mai = c1; men = c2;}
                else {mai = c2; men = c1;}
            if (c3 > mai) {mai = c3;}
                else if (c3 < men) {men = c3;}
            
            // Gravando em strings cada candidato
            if (c1 == mai && c2 == men) { mei = c3; venc = "Candidato - 1"; meio = "Candidato - 3"; perd = "Candidato - 2";}
            if (c1 == mai && c3 == men) { mei = c2; venc = "Candidato - 1"; meio = "Candidato - 2"; perd = "Candidato - 3";}
            if (c2 == mai && c1 == men) { mei = c3; venc = "Candidato - 2"; meio = "Candidato - 3"; perd = "Candidato - 1";}
            if (c2 == mai && c3 == men) { mei = c1; venc = "Candidato - 2"; meio = "Candidato - 1"; perd = "Candidato - 3";}
            if (c3 == mai && c1 == men) { mei = c2; venc = "Candidato - 3"; meio = "Candidato - 2"; perd = "Candidato - 1";}
            if (c3 == mai && c2 == men) { mei = c1; venc = "Candidato - 3"; meio = "Candidato - 1"; perd = "Candidato - 2";}
            
            // Resultado dos Votos
            System.out.println("\nCandidato 1 teve: " + c1 + " votos\nCandidato 2 teve: " + c2 + " votos\nCandidato 3 teve: "
                    + c3 + " votos\nVotos NULO  teve: " + nul + " votos\nVoto BRANCO teve: " + bra + " votos");
            System.out.println("\nO Candidato com mais Votos é " + venc + "\ne com menos Votos é : " + perd);
            
                // Cálculo de percentuais
                float soma = c1 + c2 + c3;
                float pc1 = (c1 / soma) * 100;
                float pc2 = (c2 / soma) * 100;
                float pc3 = (c3 / soma) * 100;
            
            // Definição do Segundo Turno    
            if (pc1 < 50 && pc2 < 50 && pc3 < 50) {System.out.print("\nPara o Segundo Turno: \n" + venc + "\n" + meio + "\n");}    
            if (pc1 > 50 || pc2 > 50 || pc3 > 50) {System.out.println("\nO Candidato vencedor é: " + venc);System.exit(0);} 
            
                // Variáveis auxiliares
                opc = 0; c1 = 0; c2 = 0; nul = 0; bra = 0;
            
            // Entrada de dados do Segundo Turno
            while (opc != 99999){
                System.out.print("\nDIGITE SUA OPCAO PARA O SEGUNDO TURNO\n" + venc + " - Digite <1>:\n" + meio + " - Digite <2>:"
                    + "\nVoto NULO   - Digite <0>:\nVoto BRANCO - Digite <9>: \n\nDIGITE SUA OPCAO: ");
                    opc = ent.nextInt();
                
                switch(opc){
                    case 1 :
                        c1++;
                        break;
                    case 2 :
                        c2++;
                        break;
                    case 0 :
                        nul++; 
                    case 9 :
                        bra++;
                    case 99999 :
                        break;
                    default: 
                        System.out.println("Voto inválido !!!");
                } 
                System.out.println("\n" + venc + " teve: " + c1 + " votos\n" + meio + " teve: " + c2
                        + " votos\nVotos NULO    teve: " + nul + " votos\nVoto BRANCO   teve: " + bra + " votos");
                // Cálculo dos Votos
                if (c1 > c2) {mai = c1; men = c2;}
                    else {mai = c2; men = c1;}
                        // Variáveis auxiliares
                        String venc1 = "";
                        String perd1 = "";
                // Definindo Vencedor    
                if (c1 == mai && c2 == men) { venc1 = venc; perd = meio;}
                if (c2 == mai && c1 == men) { venc1 = meio; perd = venc;}
                // Resultado Final
                System.out.println("\nO vencedor é o: " + venc1 + "\n");
            }
            
    }
}


