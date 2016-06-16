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
            int votovalido = 0;
            int maivoto = 0;
            int menvoto = 0;
            String vencedor = "";
            String perdedor = "";
            int perc = 0;
                
        while (opcao !=99999){
        
            votovalido = 0;
        
            //Entrada de dados
            System.out.print("Candidato 1 - Digite <1>:\nCandidato 2 - Digite <2>:\nCandidato 3 - Digite <3>:\nVoto NULO   - Digite <0>:\nVoto BRANCO - Digite <9>: \n\nDIGITE SUA OPCAO: ");
            opcao = ent.nextInt();
            
            if (opcao == 1){
                cand1++;
                votovalido = 1;
            }
                if (cand1 > maivoto){
                    maivoto = cand1;
                }
                if (cand1 < menvoto){
                    menvoto = cand1; 
                }
            if (opcao == 2){
                cand2++;
                votovalido = 1;
            }
                if (cand2 > maivoto){
                    maivoto = cand2;
                }
                if (cand2 < menvoto){
                    menvoto = cand2; 
                }
            if (opcao == 3){
                cand3++;
                votovalido = 1;
            }
                if (cand3 > maivoto){
                    maivoto = cand3;
                }
                if (cand3 < menvoto){
                    menvoto = cand3;
                }
            if (opcao == 0){
                nulo++;
                votovalido = 1;
            }
            if (opcao == 9){
                branco++;
                votovalido = 1;
            }
            if (maivoto == cand1){
                vencedor = "Candidato - 1";
            }
            if (maivoto == cand2) {
                vencedor = "Candidato - 2";
            }
            if (maivoto == cand3) {
                vencedor = "Candidato - 3";
            }
            if (menvoto == cand1){
                perdedor = "Candidato - 1";
            }
            if (menvoto == cand2) {
                perdedor = "Candidato - 2";
            }
            if (menvoto == cand3) {
                perdedor = "Candidato - 3";
            }
            
            if (votovalido == 0){
            System.out.println("\n\nVoto Invalido !!! Digite Novamente !!!\n\n");
            }   else {
                System.out.println("\n\nVoto Validado !!!\n\n");
                }
        }
            System.out.println("\nCandidato 1 teve: " + cand1 + " votos\nCandidato 2 teve: " + cand2
                + " votos\nCandidato 3 teve: " + cand3 + " votos\nVotos NULO  teve: " + nulo + 
                " votos\nVoto BRANCO teve: " + branco + " votos");
           
            System.out.println("\nO Candidato com mais Votos é " + vencedor + "\ne o com menos Voto é : " + perdedor);
            
            float soma = cand1 + cand2 + cand3;
            float perc1 = (cand1 / soma) * 100;
            float perc2 = (cand2 / soma) * 100;
            float perc3 = (cand3 / soma) * 100;
            
            System.out.print(soma + "  " + perc1 + "  " + perc2 + "  " + perc3);
            
            if (perc1 < 50 && perc1 > perc2 && perc1 > perc3) {
                System.out.println("O Candidato 1 vai para o Segundo turno");
            }
            if (perc2 < 50 && perc2 > perc1 && perc2 > perc3) {
                System.out.println("O Candidato 2 vai para o Segundo turno");
            }
            if (perc3 < 50 && perc3 > perc1 && perc3 > perc2) {
                System.out.println("O Candidato 3 vai para o Segundo turno");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
//           Scanner entrada = new Scanner(System.in);
//           
//           int a=0; b=0; c=0; x=0; y=0;
//           String sair = "nao";
//           
//           do {
//               
//               System.out.print(
//                      "----Votação----\n"
//                    + "1 - Candidato 1\n"          
//                    + "2 - Candidato 2\n"
//                    + "3 - Candidato 3\n"
//                    + "0 - Branco     \n"
//                    + "---------------\n "
//                    + "Voto: ");
//                v = entrada.nextInt();
//                switch(v) {              
//                    case 1 :
//                        a++;
//                        break;
//                    case 2 :
//                        b++;
//                        break;
//                    case 3 ;
//                        c++;
//                        break;
//                    case 0 :
//                        x++;
//                        break;
//                    default :
//                        y++;
//                }
//                System.out.print(
//                    "--------------\n"
//                    + "SAIR? ");
//                sair = entrada.next();                                                   
//                              
//            } while (!sair.equalsIgnoreCase("sim"));
//            System.out.print{
//                      "----Resultado--\n"
//                    + a + " - Candidato 1\n"          
//                    + b + " - Candidato 2\n"
//                    + c + " - Candidato 3\n"
//                    + x + " - Branco\n"
//                    + y + " - Nulo\n"
//                    +     "---------------\n ");
//            }
//            }   
            
             
    }
}


