
package lista4;

import java.util.Scanner;

public class resposta1 {
    
    public static void main(String[] args) { 
        
    Scanner ent = new Scanner(System.in);        
    
    // Entrada de dados
    System.out.print("Informe o Salário R$: ");
       float sala = ent.nextFloat();
    
    // Definição das variáveis
       float perc = 0;
       float aumen = 0;
       float novs = 0;
    
    // Cáculo dos Percentuais de aumento do Sálario
    if (sala <= 280) {
        perc=20;
        aumen=(sala*20)/100;
        novs=sala+aumen;
        }
    if (sala > 280 && sala <= 700) {
        perc=15;
        aumen=(sala*15)/100;
        novs=sala+aumen;
        }
    if (sala > 700 && sala <= 1500) {
        perc=10;
        aumen=(sala*10)/100;
        novs=sala+aumen;
        }
    if (sala > 15000) {
        perc=5;
        aumen=(sala*5)/100;
        novs=sala+aumen;
        }
    
    // Mostrando Resultados
    System.out.println("O Salário era R$: " + sala + "\nteve um percentual de aumento de " + perc + "%" + "\naumentou R$: " + aumen + "\nFicando com o Salário de R$: " + novs);
    
            

   
   }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
