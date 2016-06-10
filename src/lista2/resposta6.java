package lista2;

import java.util.Scanner;

public class resposta6 {
   
    public static void main(String[] args) { 
        
//    Scanner ent = new Scanner(System.in);        
//       
//    System.out.print("Digite Tamanho da area em metros quadrados ? ");
//    float area = ent.nextFloat();
//    double qtdtin = area/54;
//    if ((area%54)==0) {System.out.println("So vai precisar de " + qtdtin + " lata de tinta");
//                         System.out.println("O valor sera de R$ " + qtdtin*80);
//                }
//                else {System.out.println("Precisara de " + (Math.ceil(qtdtin)) + " latas de tinta");
//                      System.out.println("O valor sera de R$ " + (Math.ceil(qtdtin))*80);
//            
//    }
         
    Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da área a ser pintada: ");
        
        float area = entrada.nextFloat();
        
        int latas = 0;
        
        int qtd_litros = 0;
        
        if (area % 3 == 0) {
            
            qtd_litros = (int) area / 3;
            
        } else {
            
            qtd_litros = (int) area / 3 + 1;
            
        }
        
        if (qtd_litros < 18) {
            
            latas = 1;
            
        } else {
            
            if (qtd_litros % 18 == 0) {
                
                latas = qtd_litros / 18;
                
            } else {
                
                latas = qtd_litros / 18 + 1;
                
            }
            
        }
        
        float preco = latas * 80;
        
        System.out.println("Latas: " + latas + "\nPreço: " + preco);     
        
        
        
        
    }
}
