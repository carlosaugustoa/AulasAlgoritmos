package lista4;

import java.util.Scanner;

public class resposta2 {
    
    public static void main(String[] args) { 
        
    Scanner ent = new Scanner(System.in);        
    
    // Entrada de Dados
    System.out.print("Digite as Horas Trabalhadas : ");
        float horas = ent.nextFloat();
    System.out.print("Valor da hora               : ");
        float valhor = ent.nextFloat();
    
    // Criando variáveis locais   
       float sala = (horas * valhor);
       float iren = 0;
       int perciren = 0;
       float fgts = 0;
       int percfgts = 11;
       float totdesc = 0;
       float salliq = 0;
       float inss = 0;
       int percinss = 10;
       float sindi = 0;
       int percsind = 3;
       
    // Cálculo do Imposto de Renda 
    if (sala <= 900) {
        perciren = 0;
        iren=0;
        totdesc = 0;
        }
    if (sala > 900 && sala <= 1500) {
        perciren = 5;
        iren = (sala * perciren) / 100;
        totdesc = iren;
        }
    if (sala > 1500 && sala <= 2500) {
        perciren = 10;
        iren = (sala * perciren) / 100;
        totdesc = iren;
        }
    if (sala > 2500) {
        perciren = 20;
        iren = (sala * perciren) / 100;
        totdesc = iren;
        }
    
    // Cálculo do INSS
    inss = (sala * percinss) /100;
    totdesc = totdesc + inss;
    
    // Cálculo do FGTS
    fgts = (sala * 11) / 100;
    
    // Cálculo do Sindicato
    sindi = (sala * percsind) / 100;
    totdesc = totdesc + sindi;
    
    // Cálculo do Salário Liquido
    salliq = sala - totdesc;
    
    System.out.println("Salário Bruto (" + valhor + " * " + horas + "): R$ " + sala);
    System.out.println("(-)IR(" + perciren + "%)                  : R$ " + iren); 
    System.out.println("(-)INSS (10%)               : R$ " + inss);
    System.out.println("(-)Sindicato (3%)           : R$ " + sindi);
    System.out.println("FGTS (11%)                  : R$ " + fgts);
    System.out.println("Total de Descontos          : R$ " + totdesc);
    System.out.println("Salário Liquido             : R$ " + sindi);
   
   }
}  
    
