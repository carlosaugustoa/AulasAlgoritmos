package ExtruturaDeRepeticaoCase;

import java.util.Scanner;

public class Exemplo1 {
 
public static void main(String[] args, String meses){
 
     Scanner ent = new Scanner(System.in);
 
     System.out.println("Informe um número: ");
 
     int n = ent.nextInt();
     
     switch (n){
        case 1:
            System.out.println("Janeiro");
            break;
        case 2:
            System.out.println("Fevereiro");
            break;
        case 3:
            System.out.println("Março");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            meses = "Maio";
            break;
        case 6:
            meses = "Junho";
            break;
        case 7:
            meses = "Julho";
            break;
        case 8:
            meses = "Agosto";
            break;
        case 9:
            meses = "Setembro";
            break;
        case 10:
            meses = "Outubro";
            break;
        case 11:
            meses = "Novembro";
            break;
        case 12:
            meses = "Dezembro";
            break;
        default:
            meses = "mês Invalido";
            break;
        }
        //System.out.println(meses);
    



    }
} 
