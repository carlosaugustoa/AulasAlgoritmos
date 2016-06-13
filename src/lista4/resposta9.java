

package lista4;

import java.util.Scanner;

public class resposta9 {
    
    public static void main(String [] args) { 
        
    Scanner ent = new Scanner(System.in);        

    // Entrada de dados   
    System.out.print("Digite um Número Inteiro: ");
        int num = ent.nextInt();
        
        //Definindo varáveis
        int cen = 0;
        int dez = 0;
        int uni = 0;
        
        //Definindo centena, dezenas e unidades
        int cent = (num / 100);
        int deze = (num % 100) / 10;  
        int unid = ((num % 100) % 10); 
        
    if (cent == 0 ) {
    }   else if (cent == 1) {
            System.out.print("1 Centena");
        }   else {
                System.out.print(cent + " Centenas");
            }
    if (deze == 0 ) {
        }   else if (deze == 0) {
                System.out.print(" 1 Dezena");
            }   else if (cent > 0) {
                    System.out.print(", " + deze + " Dezenas");
                }   else {
                        System.out.print(deze + " Dezenas");  
                    }
    if (unid == 0 ) {
    }   else if (unid == 1) {
            System.out.print(" 1 Unidade");
        }   else if (deze > 0) {
                System.out.print(" e " + unid + " Unidades");
            }    else {
                    System.out.print(" " + unid + " Unidades");  
                 }
            
        System.out.println("");
        
                    
                   
    } 
}
