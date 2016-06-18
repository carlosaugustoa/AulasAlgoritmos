package lista5;

import java.util.Scanner;

public class Exemplo1{

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    int nota = 15;
  
        while (nota >= 0 && nota <=10) {
            System.out.print("Digite um número entre 0 e 10: ");
                nota = ent.nextInt();
            System.out.println("Nota Inválida !!!"); 
            }
    }
}