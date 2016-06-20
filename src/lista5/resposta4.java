package lista5;

import java.util.Scanner;

public class resposta4 {
    
    public static void main(String [] args) { 
    
        float a = 80000;
        float b = 200000;
        int anos = 0;
    
        while (a < b){
                a = a + (a * 0.03f);
                b = b + (a * 0.015f);
                anos++;
            System.out.println(anos + " anos população A: " + a + " população B: " + b);
        }  
            System.out.println(anos + " anos");                
    } 
}

