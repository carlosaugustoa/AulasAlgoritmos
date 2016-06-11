package lista4;

import java.util.Scanner;

public class resposta3 {
    
    public static void main(String[] args, String semana) { 
        
    Scanner ent = new Scanner(System.in);        
    
    // Entrada de dados
    System.out.print("Digite em Número o dia da Semana : ");
       int dia = ent.nextInt();
    
    // Usando if para mostrar dia da semana
    if (dia == 1){
        semana = "Domingo";
    }
    if (dia == 2 {
        semana = "Segunda";
    }
    if (dia == 3){
        semana = "Terça";
    }
    if (dia == 4 {
        semana = "Quarta";
    }
    if (dia == 5){
        semana = "Quinta";
    }
    if (dia == 6 {
        semana = "Sexta";
    }
    if (dia == 7){
        semana = "Sábado";
    }
    if (dia <1 || dia >7) {
        System.out.println("Dia Invalido !");
        System.exit();
    }
        System.out.println("Dia da Semana " + semana);
        
        
   }
}