//Faça um programa para uma loja de tintas. O programa deverá pedir o 
//tamanho em metros quadrados da área a ser pintada. Considere que a cobertura 
//da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida 
//em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades 
//de latas de tinta a serem compradas e o preço total.
// */
package Lista3;

import java.util.Scanner;

public class jaira {
    private static Object Matc;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da área em metros2: ");
        float n1 = sc.nextInt();
              
        float l = (float) (n1/3);
        
        float c = (float) Math.ceil(l/18);
        float p = (c*80);
                 
               
        
        System.out.println("Quantidade de latas necessário = " + c);
        
        System.out.println("Valor total = " + p);
        
        
        
    }
}