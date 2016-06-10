
package lista1;

import java.util.Scanner;

public class resposta1 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.println("Digite Primeiro Número Inteiro: ");
        int n1 = ent.nextInt();
    System.out.println("Digite Segundo Número Inteiro: ");
        int n2 = ent.nextInt();
    System.out.println("Digite um Número Real: ");
        float n3 = ent.nextFloat();
        float a = n1*2+n2/2;
        float b = n1*3+n3;
        float c = n3*n3*n3;
    System.out.println("A solução a. é: " + a );
    System.out.println("A solução b. é: " + b );
    System.out.println("A solução c. é: " + c );    
    
    
    }

}  