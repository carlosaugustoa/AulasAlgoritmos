package lista5;

import java.util.Scanner;

public class resposta7 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
        int maior = 0;
        int cont = 0;
    
    while (cont < 5){
        System.out.print("Digite um Números : ");
            int numero = ent.nextInt();
            cont++;
        if( numero > maior){
            maior = numero;
        }
    }   
        System.out.println("O maior número informado foi o: " + maior);
                    
    }
}
