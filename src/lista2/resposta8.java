package lista2;

import java.util.Scanner;

public class resposta8 {
     
    public static void main(String[] args) { 
        
//    Scanner ent = new Scanner(System.in);        
//       
//    System.out.print("Digite Tamanho da ARQUIVO(Mb) para DOWNLOAD : ");
//    float arquivo = ent.nextFloat();
//    
//    System.out.print("Digite a Velocidade em  Mbps : ");
//    float velocidade = ent.nextFloat();
//   
//    double tempo = Math.ceil((arquivo / (velocidade / 8)) / 60);
//    System.out.println("O tempo estimado será de : " + tempo + " minutos");
      
    
    Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do arquivo: ");
        
        float tamanho = entrada.nextFloat();
        
        System.out.print("Informe a sua velocidade: ");
        
        float velocidade = entrada.nextFloat();
        
        float tempo = (tamanho / (velocidade / 8f)) / 60f;
        
        System.out.println("Tempo: " + tempo);
    }
}