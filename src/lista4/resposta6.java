
package lista4;

import java.util.Scanner;

public class resposta6 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
        //Digitação do nùmero a
        System.out.print("Digite a : ");
            int a = ent.nextInt();
    
    //Resposta a - se a for igual 0 encerrar
    if (a == 0){
        System.out.println("Valor Inválido < a > não pode ser igual a zero !!!");
        System.exit(0);
    }

        //Digitação número b e c
        System.out.print("Digite b : ");
            int b = ent.nextInt();
        System.out.print("Digite c : ");
            int c = ent.nextInt();
    
        //Definindo variávies
        float raizdelt = 0;

        //Cálculo do Delta
        int delta = ( b * b ) - ( 4 * a * c );
        raizdelt = (float)Math.sqrt(delta);
        
    //Resposta b - Se o delta for negativo da mensagem
    if (delta < 0) {
        System.out.println("O Delta é Negativo a equação não possui raízes reais !!");
        System.exit(0);
    }
        //Definindo variáveis;
        float x1 = 0;
        float x2 = 0;
        
        //Cáculo das raizes
        x1 = ( (-1)*b + raizdelt) / ( 2 * a );
        x2 = ( (-1)*b - raizdelt) / ( 2 * a );
        
        System.out.println(delta);
    
    //Resposta c - Se o delta for zero a equação possui apenas 1 raiz x1 = x2
    if (delta == 0){
        System.out.println("As raizes são iguais x1 = x2 " + x1);
        System.exit(0);
    }
    if (delta > 0){  
        System.out.println("As raizes são x1 = " + x1 + " e x2 = " + x2);
    } 
    
        
    }
}