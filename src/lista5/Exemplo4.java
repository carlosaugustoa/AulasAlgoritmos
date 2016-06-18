package lista5;

import java.util.Scanner;

public class Exemplo4 {
    
    public static void main(String [] args) { 
    
        float a = 80000;
        float b = 200000;
        int anos = 0;
    
    while (a < b){
        a = a + (80000 * 3);
        b = b + (200000 * (15 / 10));
        anos = anos + 1;
        System.out.println(a + " " + b);
    }  
        System.out.println(anos + " anos");                
    } 
}
