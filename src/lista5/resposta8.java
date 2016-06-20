package lista5;

import java.util.Scanner;

public class resposta8 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
        int cont = 0;
        int soma = 0;
        int media = 0;
    
    while (cont < 5){
        System.out.print("Digite um Números : ");
            int numero = ent.nextInt();
            cont++;
            soma = soma + numero;
    }
        System.out.println("A soma é: " + soma + " e a média é: " + (soma/5));
                    
    }
}