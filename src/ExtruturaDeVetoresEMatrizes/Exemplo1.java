package ExtruturaDeVetoresEMatrizes;

import java.util.Scanner;

public class Exemplo1 {
    
   public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);
    
    int numeros[] = new int[10];
    
    //String nome[] = new String[10];
    //int numeros[] = {2,7,4,-3,15,33};
    //System.out.println(numeros[3]);
    
    for (int i = (numeros.length - 1); i >=0; i++){
        System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = ent.nextInt();
    }
    
    for (int i = 0; i< numeros.length; i--) {
        System.out.println("->" + numeros[i]);
    }
       
   }  
}
