package lista5;

import java.util.Scanner;

public class resposta5 {
    
    public static void main(String [] args) { 
    
    Scanner ent = new Scanner(System.in);
        
        int f = 0;
                 
        while (f == 0){
            System.out.print("Informe a População: ");
                int p = ent.nextInt();
            if (p == 0){
                f = 1; 
            }
            System.out.print("Informe a Taxa Crescimento: ");
                int t = ent.nextInt();
            if (t ==0 ){
                f = 1;
            }             
                float a = p + (p * t)/10;
            if (p >0 && t > 0){    
                System.out.println("População : " + p + " taxa : " + t + " aumento de " + a);
            }
        }
        
        
    }
}    