

package lista3;

import java.util.Scanner;

public class resposta6 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.print("Digite Número 1 : ");
        int n1 = ent.nextInt();
    System.out.print("Digite Número 2 : ");
        int n2 = ent.nextInt();
    System.out.print("Digite Número 3 : ");
        int n3 = ent.nextInt(); 
        
    if (n1 > n2 && n1> n3) {
        System.out.println("O mairo é o número n1 : " + n1);
              }
    if (n2 > n1 && n2 > n3) {
        System.out.println("O maior é  o número n2 : " + n2);
             } 
    if (n3 > n1 && n3 > n2) {
        System.out.println("O maior é o número n3 : " + n3);
               } 
    if (n1 == n2 && n1 == n3) {
        System.out.println("Todos os número são iguais");
               } 
    }
}


