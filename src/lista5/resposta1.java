package lista5;

import java.util.Scanner;

public class resposta1{

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
            int nota = 15;
  
        while (nota < 0 || nota >10) {
                System.out.print("Digite um número entre 0 e 10: ");
                    nota = ent.nextInt();
                if (nota <0 || nota > 10){
                System.out.println("Nota Inválida !!!");
                } 
        }    
    }
}
