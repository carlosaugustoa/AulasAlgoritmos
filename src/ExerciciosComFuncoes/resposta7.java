//    Exercícios com Funções
//
// Faça um programa que use a função valorPagamento para determinar o valor a
// ser pago por uma prestação de uma conta. O programa deverá solicitar ao
// usuário o valor da prestação e o número de dias em atraso e passar estes
// valores para a função valorPagamento, que calculará o valor a ser pago e
// devolverá este valor ao programa que a chamou. O programa deverá então
// exibir o valor a ser pago na tela. Após a execução o programa deverá voltar
// a pedir outro valor de prestação e assim continuar até que seja informado
// um valor igual a zero para a prestação. Neste momento o programa deverá ser
// encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor 
// total de prestações pagas no dia. O cálculo do valor a ser pago é feito da 
// seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação.
// Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

package ExerciciosComFuncoes;

import java.util.Scanner;

public class resposta7 {
    
   public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);

        float valpg[] = new float[1000];
        int valor = 10;
        float multa = 0.3f;
        float juros = 0.1f;
        float jurosd = 0;
        int cont = 0;
                          
        while (valor != 0){
            
            cont++;
                        
            System.out.print("Valor: ");
                
                valor = ent.nextInt();
        
            System.out.print("Dias em atraso: ");
                
                int diaatr = ent.nextInt();
            
                jurosd = diaatr * juros;
                valpg[cont] = valor + (valor * jurosd)/100 + (valor * multa)/100;    
            
            System.out.println("Valor a pagar: " + valpg[cont]);
        }    
            
            float soma = 0;
        
            for (float val : valpg){ 
                if (val == 0){
                    break;
                }
                soma = soma + val;
                
                System.out.println(val);
            }       
            
            System.out.println(soma);
    }
}