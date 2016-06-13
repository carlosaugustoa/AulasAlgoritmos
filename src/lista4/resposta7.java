package lista4;

import java.util.Scanner;

public class resposta7 {
    
    public static void main(String [] args) { 
        
    Scanner ent = new Scanner(System.in);        

    // Entrada de dados   
    System.out.print("Digite o ANO <AAAA>: ");
        int ano = ent.nextInt();
        
        // Variável auxiliar
        int aux = 0;
        int auxano = Math.round(ano % 4f);
                
    //Consiste o ano se é BISSEXTO
    if (auxano > 0) {
            aux = 1; 
    } 
             
    // Resuldo Final
    if (aux == 1) {
        System.out.println("Este ano nâo è bissexto !!!");
    }   else {
            System.out.println("Ano BISSEXTO !!!");
        } 
                         
    } 
}
