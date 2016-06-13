package lista4;

import java.util.Scanner;

public class resposta8 {
    
    public static void main(String [] args) { 
        
    Scanner ent = new Scanner(System.in);        

    // Entrada de dados   
    System.out.print("Digite Data <DDMMAAAA>: ");
        String dat = ent.next();
        String date = dat;
        String 
        
        //Separa o dia mes e ano  
        substring = date.substring(0, 2);
        String diadt = substring;
        substring = date.substring(2, 4);
        String mesdt = substring;
        substring = date.substring(4, 8);
        String anodt = substring;
                
        // Muda variável de String para Int
        int dia = Integer.parseInt(diadt);
        int mes = Integer.parseInt(mesdt);
        int ano = Integer.parseInt(anodt);  
                
    // Consiste o dia e o meses, sem o mês de fevereiro
    if ((dia < 0) || (dia > 31)) {
        System.out.println("Dia Inválido !!!");
        System.exit(0);
    }
    if ((mes == 4) && (mes == 6) && (mes == 9) && (mes == 11)) {
    }   else if (dia > 30){
            System.out.println("Dia Inválido !!!");
            System.exit(0);
        }    
    if ((mes < 0) || (mes > 12)) {
       System.out.println("Mes Inválido !!!");
       System.exit(0);
    }     
        
        // Variável auxiliar
        int aux = 1;
        double auxanoc = (ano % 4f);
        int auxano = (int) Math.round(auxanoc);
        
    //Consiste o dia do mes de fevereiro
    if ((mes == 2) && (auxano > 0) && (dia > 28)) {
        aux = 2; 
    }
    if ((mes == 2) && (auxano == 0) && (dia > 29)) {
        aux = 2;
    } 
             
    // Resuldo Final
    if (aux == 1) {
        System.out.println(dia + "/" + mes + "/" + ano + " Data Correta !!!");
    }   else {
            System.out.println("Data Inválida !!!");
        } 
        
                           
    } 
}
