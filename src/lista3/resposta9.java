
package lista3;

import java.util.Scanner;

public class resposta9 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
    System.out.print("Digite Número 1 : ");
        int n1 = ent.nextInt();
    System.out.print("Digite Número 2 : ");
        int n2 = ent.nextInt();
    System.out.print("Digite Número 3 : ");
        int n3 = ent.nextInt();   
    
    if( n1 < n2 && n2 < n3 ) {
        System.out.println (n3+" "+n2+" "+n1);
    } else if( n1 < n3 && n3 < n2 ) {
        System.out.println (n2+" "+n3+" "+n3);
    } else if( n2 < n1 && n1 < n3 ) {
        System.out.println (n3+" "+n1+" "+n2);
    } else if( n2 < n3 && n3 < n1 ) {
        System.out.println (n1+" "+n3+" "+n2);
    } else if( n3 < n2 && n2 < n1 ) {
        System.out.println (n1+" "+n2+" "+n3);
    } else if( n3 < n1 && n1 < n2 ) {
        System.out.println (n2+" "+n1+" "+n3);
    }
    
    }
}
