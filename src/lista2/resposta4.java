package lista2;

import java.util.Scanner;

public class resposta4 {
    
    public static void main(String[] args) {  
    
    Scanner ent = new Scanner(System.in);
// 
//    System.out.print("Digite o peso da PESCA: ");
//       float peso = ent.nextInt();
//       
//       if (peso > 50) {float excesso = peso - 50;
//                       float multa = 4 * excesso;
//                       System.out.println("Excesso de peso " + excesso + "kg Multa Total de " + multa + " reais");
//                      }
//            else {System.out.println("Seu peso foi de " + peso + "kg Nao teve multa");
//                 }
//        System.out.print("Informe o peso: ");
        
        float peso = ent.nextFloat();
        
        float multa = 0;
        
        float excesso = 0;
        
        if (peso > 50) {
            
            excesso = peso - 50;
            
            multa = excesso * 4;
            
        }
        
        System.out.println("Peso: " + peso + "\nExcesso: " + excesso + "\nMulta: " + multa);
                 
       
  }
}