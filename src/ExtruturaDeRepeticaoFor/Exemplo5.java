package ExtruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exemplo5 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
    
    System.out.print("Digite um número : ");
    int f=1, n = ent.nextInt();
    
    String p = "";
    
    for (int i=n;i>0;i--) { 
    
        if (i == 1){
           p += 1;
        } else {
           p += i + " x "; 
        }
    
        f *=i;
    }    
    
    System.out.println(n + " ! = " + p + " = " + f); 
    
       
    
    }
}

