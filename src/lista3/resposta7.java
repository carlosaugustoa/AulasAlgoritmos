
package lista3;

import java.util.Scanner;

public class resposta7 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
        System.out.print("Digite Número 1 : ");
        float n1 = ent.nextInt();
    
        System.out.print("Digite Número 2 : ");
        float n2 = ent.nextInt();
    
        System.out.print("Digite Número 3 : ");
        float n3 = ent.nextInt(); 
        
        float maior = 0f;
        float menor = 0f;
    
        
    if (n1 > n2){
        maior = n1;
        menor = n2;
    } else {
        maior = n2;
        menor = n1;
    }
    if (n3 > maior) {
        maior = n3;
    } else if (n3 < menor){
        menor = n3;
    }  
//    if (n1 > n2 && n1 > n3) {maior = n1;
//                            } 
//    if (n2 > n1 && n2 > n3) {maior = n2;
//                            }    
//    if (n3 > n1 && n3 > n2) {maior = n3;
//                            } 
//    if (n1 < n2 && n1 < n3) {menor = n1;
//                            }
//    if (n2 < n1 && n2 < n3) {menor = n2;
//                            } 
//    if (n3 < n1 && n3 < n2) {menor = n3;
//                            } 
        System.out.println("O MAIOR número é : " + maior + " e o MENOR número é : " + menor);
        
    }
}

