//   Exercícios com Funções
//
// Data com mês por extenso. Construa uma função que receba uma data no formato
// DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. 
// Opcionalmente, valide a data e retorne NULL caso a data seja inválida.
//

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta11 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
    
        int dia = 50;
        int mes = 0;
        int ano = 0;
            
    while (dia < 1 || dia > 31){
        
        System.out.print("Digite dia ");
            dia = ent.nextInt();
        System.out.print(dia + "/");
            mes = ent.nextInt();
        System.out.print(dia + "/" + mes + "/");    
            ano = ent.nextInt();
                   
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if (dia > 30){
                System.out.print("Dia inválido !!!\n");
                mes = 35;
            }
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia > 31){
                System.out.print("Dia inválido !!!");
                mes = 35;
            }
        }
        
        if (mes == 2){
            if ((ano % 4) == 0){
                if (mes > 29){
                    System.out.print("Mês Inválido !!!");
                    mes = 35;
                }
            }
            if ((ano % 4) != 0){
                if (mes > 28){
                    System.out.print("Mês Inválido !!!");
                    mes = 35;
                }
            }
        }    
        
    }
           String mesh = "";
            
        switch(mes){
            case 1 :
                mesh = "janeiro";
                break;
            case 2 :
                mesh = "fevereiro";
                break;
            case 3 :
                mesh = "março";
                break;
            case 4 :
                mesh = "abril";
                break;
            case 5 :
                mesh = "maio";
                break;
            case 6 :
                mesh = "junho";
                break;
            case 7 :
                mesh = "julho";
                break;
            case 8 :
                mesh = "agosto";
                break;
            case 9 :
                mesh = "setembro";
                break;
            case 10 :
                mesh = "outubro";
                break;
            case 11 :
                mesh = "novembro";
                break;
            case 12 :
                mesh = "dezembro";
                break;
        }

        System.out.print("Data : " + dia + " de " + mesh + " de " + ano + "\n");
        
    }    
}
    
