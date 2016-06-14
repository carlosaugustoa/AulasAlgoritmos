package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo1 {

  public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
  
    String resposta = "nao";
    int tentativa = 0;
    
    while (!resposta.equalsIgnoreCase("sim")){
        System.out.print("Eu sou bonito? ");
        resposta = ent.next();
        tentativa = tentativa + 1;
    }
    System.out.println("Parabéns tentou negar minha belez " + tentativa + "vezes !!!");
  }
}