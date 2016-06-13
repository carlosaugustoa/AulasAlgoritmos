
package lista4;

import java.util.Scanner;

public class resposta10 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
        //Digitação da Notas 1
        System.out.print("nota n1: ");
            Float n1 = ent.nextFloat();
    
    //Verifica se a Nota é maior que 10
    if (n1 > 10){
        System.out.println("Nota Invalida !!!");
        System.exit(0);
    }

        //Entrada da Nota 2
        System.out.print("nota n2: ");
            Float n2 = ent.nextFloat();
    
    //Verifica se a Nota é maior que 10
    if (n2 > 10){
        System.out.println("Nota Invalida !!!");
        System.exit(0);
    }
    
        //Entrada da Nota 3
        System.out.print("nota n3: ");
            Float n3 = ent.nextFloat(); 
    
    //A Nota não pode ser maior que 10
    if (n2 > 10){
        System.out.println("Nota Invalida !!!");
        System.exit(0);
    }
        
        //Cálculo da Média
        Float media = (n1 + n2 + n3) / 3;
    
    //Verifica pela Média se o Aluno está Aprovado, Reprovado ou Aprovado com Distinção
    if (media == 10 ) {
        System.out.println("Aprovado com DISTINÇÃO:");           
    }   else if ((media >= 7) && (media < 10)) {
            System.out.println("Aprovado !!!");
        }   else {
                System.out.println("Reprovado !!!");
            }
    
    }
}
