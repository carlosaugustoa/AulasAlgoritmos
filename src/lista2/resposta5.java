package lista2;

import java.util.Scanner;

public class resposta5 {
   
    public static void main(String[] args) { 
        
// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//    Calcule e mostre o total do seu salário no referido mês.     
        
//    Scanner ent = new Scanner(System.in);        
       
//    System.out.print("Quanto voce ganha por HORA ? ");
//    float valor = ent.nextFloat();
//    System.out.print("Quantas HORAS você trabalhou no MÊS ? ");
//    float horas = ent.nextFloat();
//    float salario = valor * horas ;
//    System.out.println("Salário BRUTO é de R$ " + salario );
//    float impr = (salario*11)/100;
//    System.out.println("Desconto de Imposto de Renda e de R$ " + impr);
//    float inss = (salario*8)/100;
//    System.out.println("Desconto de INSS e de R$ " + inss);
//    float sindicato = (salario*5)/100;
//    System.out.println("Desconto do Sindicato e de R$ " + sindicato);
//    float liquido = salario-(impr+inss+sindicato);
//    System.out.println("Salario Liquido do mes e de R$ " + liquido);
    
       Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor da sua hora trabalhada: ");
        
        float ht = entrada.nextFloat();
        
        System.out.print("Informe quantas horas você trabalhou: ");
        
        float qh = entrada.nextFloat();
        
        float a = ht * qh;
        
        float b = a * 0.08f;
        
        float c = a * 0.05f;
        
        float d = a - b - c - a * 0.11f;
        
        System.out.println("Salário Bruto: " + a
            + "\nINSS: " + b
            + "\nSindicato: " + c
            + "\nSalário Líquido: " + d);
        
    
    
    
    
    }
}

