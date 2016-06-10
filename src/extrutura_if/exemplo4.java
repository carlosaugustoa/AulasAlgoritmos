package extrutura_if;

import java.util.Scanner;

public class exemplo4 {

public static void main(String args[]) {

    

    Scanner ent = new Scanner(System.in);

// DIAS DA SEMANA    
    System.out.print("Que dia é o dia da Semana? ");
    int diaDaSemana = ent.nextInt();
       
    switch (diaDaSemana) {
    case 1:
    System.out.println("Domingo");
    break;
    case 2:
    System.out.println("Segunda-feira");
    break;
    case 3:
    System.out.println("Terça-feira");
    break;
    case 4:
    System.out.println("Quarta-feira");
    break;
    case 5:
    System.out.println("Quinta-feira");
    break;
    case 6:
    System.out.println("Sexta-feira");
    break;
    case 7:
    System.out.println("Sábado");
    break;
    default:
    System.out.println("Este não é um dia válido!");
    }


// MESES DO ANO
//    System.out.print("Informe em Número o Mês? ");
//    int mes = ent.nextInt();
//        String meses;
//        switch (mes) {
//            case 1:  meses = "Janeiro";
//                     break;
//            case 2:  meses = "Fevereiro";
//                     break;
//            case 3:  meses = "Março";
//                     break;
//            case 4:  meses = "Abril";
//                     break;
//            case 5:  meses = "Maio";
//                     break;
//            case 6:  meses = "Junho";
//                     break;
//            case 7:  meses = "Julho";
//                     break;
//            case 8:  meses = "Agosto";
//                     break;
//            case 9:  meses = "Setembro";
//                     break;
//            case 10: meses = "Outubro";
//                     break;
//            case 11: meses = "Novembro";
//                     break;
//            case 12: meses = "Dezembro";
//                     break;
//            default: meses = "mês Invalido";
//                     break;
//        }
//        System.out.println(meses);
        
   }
}
