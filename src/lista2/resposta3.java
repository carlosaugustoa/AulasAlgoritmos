package lista2;

import java.util.Scanner;

public class resposta3 {
    
    public static void main(String[] args) {  
    
    Scanner ent = new Scanner(System.in);
// 
//    System.out.print("Digite a Altura da Pessoa: ");
//        Float altura = ent.nextFloat();
//    
//    System.out.print("Digite o SEXO da Pessoa (M-MASCULINO ou F-FEMININO): ");
//        String sex = ent.next();
//        
//        float pesoideal = 0;
//           
////            if (sex == "M") { 
////                double peso = ((72.7 * altura) - 58);
////                System.out.print("Seu peso ideal é " + peso);
////                }
////                else { double peso = ((61.1 * altura) - 44.7);
////                       System.out.println("Seu peso ideal é " + peso);
////                     }          
//        switch(sex){
//        case "M": case "m" : case "MASCULINO" : case "masculino" :
//            //double peso = (72.7 * altura) - 58;
//            pesoideal = (72.7f * altura) - 58f;
//            System.out.println("Seu peso ideal é " + pesoideal);
//            break;
//        case "F": case "f" : case "FEMININO" : case "feminino" :
//            pesoideal = (61.1f * altura) - 44.7f;
//            System.out.println("Seu peso ideal é " + pesoideal);
//            break;
//        default: 
//            System.out.println("Sexo Inválido");
//            pesoideal = 0;
//            
//            //System.out.println("Você Nao digitou o sexo correto !!!!");
//
//        }
//        System.out.print("Informe seu peso: ");
//        Float peso = ent.nextFloat();
//
//        if (peso == 0) {
//            System.out.println("ERRO!!!\nVocê não digitou o SEXO");
//        } else if (peso < pesoideal) {
//            System.out.println("ATENÇÃO!!!\nVocê está abaixo do peso ideal");
//        } else if (peso == pesoideal) {
//            System.out.println("ATENÇÃO!!!\nVocê está abaixo do peso ideal");
//        } else {
//            System.out.println("ATENÇÃO!!!\nVocê está acima do peso ideal");
//        }

        System.out.print("Informe seu sexo: ");

        String sexo = ent.next();
        
        String sexoEscolhido = "";
        
        switch (sexo) {
            case "M": case "m": case "MASCULINO": case "masculino":
                sexoEscolhido = "m";
                break;
            case "F": case "f": case "FEMININO": case "feminino":
                sexoEscolhido = "f";
                break;
            default:
                System.out.println("Sexo Inválido!!!");
                System.exit(0);
        }
        
        System.out.print("Informe sua altura: ");

        float altura = ent.nextFloat();

        float pesoIdeal = 0;

        switch(sexoEscolhido) {
           case "m":
               pesoIdeal = (72.7f * altura) - 58;
               break;
           case "f":
               pesoIdeal = (62.1f * altura) - 44.7f;
               break;
        }
        
        System.out.print("Informe seu peso: ");
        
        float peso = ent.nextFloat();
         
        if (peso < pesoIdeal) {
            
            System.out.println("ATENÇÃO!!!\nVocê está abaixo do peso ideal");
        
        } else if (peso > pesoIdeal) {
            
            System.out.println("ATENÇÃO!!!\nVocê está acima do peso ideal");
        
        } else {
            
            System.out.println("PARABÉNS!!!\nVocê está no peso ideal");
        
        }
    } 
}
