
package lista2;

import java.util.Scanner;

public class resposta7 {
   
    public static void main(String[] args) { 
        
//    Scanner ent = new Scanner(System.in);        
//       
//    System.out.print("Digite Tamanho da area em metros quadrados ? ");
//    Float area = ent.nextFloat();
//    
//    float galao = Math.round(area/21.6f);
//    float tinta = Math.round(galao/5f);
//        
//    if (tinta > 0 && galao % 5 == 0)    {System.out.println("So vai precisar de " + tinta + " latao tinta de 18 litros");
//                                         System.out.println("O valor sera de R$ " + tinta * 80 );
//                                        }
//    if (tinta > 0 && galao % 5 != 0)    {double galaorest = Math.ceil((area-(tinta*108))/21.6); 
//                                         System.out.println("Prescisa de " + tinta + " latão de tinta de 18 litros");
//                                         System.out.println("No valor é de R$ " + tinta * 80 + " latão de tinta");
//                                         System.out.println("e mais " + galaorest + " galóes de tinta 3,6 litros");
//                                         System.out.println("No valor de R$ " + galaorest * 25 + " galões de tinta");
//                                        }
//    if (tinta < 0 && galao % 5 != 0)    {double galaorest = galao;
//                                         System.out.println("e mais " + galaorest + " galóes de tinta de 3,6 litros");
//                                         System.out.println("No valor de R$ " + galaorest * 25 + " galões de tinta");
//                                        }
//     
    
     Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a área a ser pintada: ");
        
        float area = entrada.nextFloat();
        int qtd_litros = 0;
        
        if (qtd_litros % 6 == 0) {
            qtd_litros = (int) area / 6;
        } else {
            qtd_litros = (int) area / 6 + 1;
        }
        
        System.out.print("1 - Só Latas\n2 - Só Galões\n3 - Melhor Preço\nEscolha uma das opções acima: ");
        
        int escolha = entrada.nextInt();
        int latas = 0, galoes = 0;
        float resto = 0, preco = 0;
        
        switch(escolha) {
            case 1:
                if (qtd_litros < 18) {
                    latas = 1;
                } else if (qtd_litros % 18 == 0) {
                    latas = (int) qtd_litros / 18;
                } else {
                    latas = (int) qtd_litros / 18 + 1; 
                }
                preco = latas * 80;
                break;
            case 2:
                if (qtd_litros < 3.6f) {
                    galoes = 1;
                } else if (qtd_litros % 3.6 == 0) {
                    galoes = (int) (qtd_litros / 3.6f);
                } else {
                    galoes = (int) (qtd_litros / 3.6f + 1);
                }
                preco = galoes * 25;
                break;
            case 3:
                latas = (int) qtd_litros / 18;
                resto = qtd_litros % 18;
                if (resto % 3.6f == 0) {
                    galoes = (int) (resto / 3.6f);
                } else {
                    galoes = (int) (resto / 3.6f + 1);
                }
                preco = latas * 80 + galoes * 25;
                break;
            default:
                System.out.println("Opção Inválida!!!\nRepita a operação!!!");
                System.exit(0);
        }
        
        System.out.println("Latas: " + latas + "\nGalões: " + galoes + "\nPreço: " + preco);
        
        entrada.close();   
        
        
        
        
    }
}
