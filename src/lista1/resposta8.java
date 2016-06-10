
package lista1;

import java.util.Scanner;

public class resposta8 {
   
    public static void main(String[] args) { 
        
// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//    Calcule e mostre o total do seu salário no referido mês.     
        
    Scanner ent = new Scanner(System.in);        
       
    System.out.println("Informe o valor da sua HORA ? ");
    float valor = ent.nextFloat();
    System.out.println("Quantas Horas você trabalhou no MÊS ? ");
    float horas = ent.nextFloat();
    float salario = valor * horas ;
    System.out.println("O Salário do Mês é : " + salario );
            
                  
    }
}
