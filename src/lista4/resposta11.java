package lista4;

import java.util.Scanner;

public class resposta11 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    // Entrada da Nota 1   
    System.out.print("nota n1: ");
        Float n1 = ent.nextFloat();
        
    // Se Nota 1 for maior que 10 sai
    if (n1 > 10){
        System.out.println("Número Invalido !!!");
        System.exit(0);
    }
    
    // Entrada da Nota 2
    System.out.print("nota n2: ");
        Float n2 = ent.nextFloat();
    
    // Se Nota 2 for maior que 10 sai
    if (n2 > 10){
        System.out.println("Número Invalido !!!");
        System.exit(0);
    }
    
        // Definindo Variáveis
        String conceito = "";
        String situacao = "";
        String a = "APROVADO";
        String b = "REPROVADO";
        
        // Cálculo da Média
        float media = (n1 + n2) / 2;
    
    // if para defenir o Conceito e a Situação do Aluno
    if ( media >= 9 && media <= 10) {
        conceito = "A";
        situacao = a;
    }
    if ( media >= 7.5 && media < 9 ) {
        conceito = "B";
        situacao = a;
    }  
    if ( media >=6 && media < 7.5 ) {
        conceito = "C";
        situacao = a;
    }   
    if ( media >= 4 && media < 6 ) {
        conceito = "D";
        situacao = b;
    }  
    if ( media < 4 ) {
        conceito = "E";
        situacao = b;
    }
        // Mostra a informção obtida
        System.out.println("Nota 1: " + n1 + "\nNota 2: " + n2 + "\nMédia: " + media + "\nConceito: " + conceito + " - " + situacao);           
          
    }
}
