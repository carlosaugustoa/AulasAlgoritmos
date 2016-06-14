package lista4;

import java.util.Scanner;

public class resposta5 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    //Entrada dos lados do Triângulo   
    System.out.print("Lado 1: ");
       int ladoa = ent.nextInt();
    System.out.print("Lado 2: ");
       int ladob = ent.nextInt();
    System.out.print("Lado 3: ");
       int ladoc = ent.nextInt();
  
       //Variáveis de Cálculo
       // | b - c | < a < b + c 
       // | a - c | < b < a + c 
       // | a - b | < c < a + b 
       int a = (ladob - ladoc);
       int b = (ladoa - ladoc);
       int c = (ladoa - ladob);
       
       int d = (ladob + ladoc);
       int e = (ladoa + ladoc);
       int f = (ladoa + ladob);
       int aux = 0;
       
    //Para saber se os lados forma um Triãngulo
    if ((a < ladoa) && (ladoa < d)) { 
        aux = 1;
    } 
    if ((b < ladob) && (ladob < e)) {
        aux = 1;
    }
    if ((c < ladoc) && (ladoc < f)) {
        aux = 1;
        }
    
// verificar depois
    
    if (aux == 0){
        System.out.println("Não é um triângulo !!!");
        System.exit(0);
    }
            
    //Verifica e mostra se o Triângulo é Equilátero, Isóceles ou Escaleno
    if ((ladoa == ladob) && (ladob == ladoc)){
        System.out.println("O Triângulo e Equilátero !!!");
    }
    if ((ladoa == ladob) && (ladoa != ladoc)){
        System.out.println("O Triângulo e Isóceles !!!");
    }
    if ((ladob == ladoc) && (ladob != ladoa)){
        System.out.println("O Triângulo e Isóceles !!!");
    }
    if ((ladoc == ladoa) && (ladoc != ladob)){
        System.out.println("O Triângulo e Isóceles !!!");
    }
    if ((ladoa != ladob) && (ladob != ladoc) && (ladoc != ladoa)) {
        System.out.println("O Triângulo e Escaleno !!!");
    }
       
       
    }
}