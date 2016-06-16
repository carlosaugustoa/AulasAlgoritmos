package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    //Entrada de dados
    System.out.print("Digite um Números : ");
        int numero = ent.nextInt();
        
//        //Variável auxiliar
//        int cont = 0;
//        int i = 0;
        
//    //Loop para forçar várias divisões
//    for ( i = 1; i <= numero; i++ ){
//        //Conta quantas vezes as divisões o Resto é 0
//        if(numero % i == 0)
//            cont ++;
//        }
//        //Verifica se o resultado é primo ou não
//        if (cont == 2){
//            System.out.println("o numero " + numero + " é primo");
//        }   else{
//                System.out.println("o numero " + numero + " não é primo");
//            }   
            
            //Variáveis auxiliares
            int aux = 1;
            int cont = 1;
        
        //Loop para dividir o número várias vezes    
        while(!(aux == numero)){  
            if (numero % aux == 0){
                cont++;
            }
            aux++;
        }
                   
        //Verifica se o resultado é primo ou não e mostra
        if (cont == 2){
            System.out.println("o numero " + numero + " é primo");
        }   else{
                System.out.println("o numero " + numero + " não é primo");
            }   
            
  }
}

