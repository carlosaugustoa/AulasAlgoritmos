package lista2;

import java.util.Scanner;

public class resposta1 {
    
    public static void main(String[] args) {  

////    Scanner ent = new Scanner(System.in);
// 
//    System.out.print("Digite Número 1 inteiro : ");
//        int n1 = ent.nextInt();
//    
//    System.out.print("Digite Número 2 inteiro : ");
//        int n2 = ent.nextInt();
//    
//    System.out.print("Digite Número 3 Real: ");
//        float n3 = ent.nextFloat();
//        
//        float a = (n1*2)*(n2/2);
//        float b = n1*3+n3;
//        float c = n3*n3*n3;
//        
//    System.out.println("O produto do dobro do n1 com metade do n2 é: " + a );
//    System.out.println("A soma do triplo do n1 com o n3: " + b );
//    System.out.println("o terceiro elevado ao cubo é: " + c );    
//    
//    //System.out.println("A: " + a + "\B: " + b + "\nC: " + c);   
    
    Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número 01: ");
        
        int n1 = entrada.nextInt();
        
        System.out.print("Digite o número 02: ");
        
        int n2 = entrada.nextInt();
        
        System.out.print("Digite o número 03: ");
        
        float n3 = entrada.nextFloat();
        
        float a = 2 * n1 * n2 / 2;
        
        float b = 3 * n1 + n3;
        
        float c = n3 * n3 * n3;
        
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);
        
        entrada.close(); 
    
    
    
    
    
    
    }

} 