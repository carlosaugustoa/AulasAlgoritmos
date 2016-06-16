package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
    //Entrada de dados
    System.out.print("Digite um Números : ");
        int numero = ent.nextInt();
        
        //Variável auxiliar
        int cont = 0;
        int a = 0;
        int b = 0;
        
    //Loop para forçar várias divisões
    for ( a = 1; a <= numero; a++ ){
        
        //Loop dentro do loop para testar cada número
        for ( b = 1; b <= a; b++ ){
            if( a % b == 0)
            cont ++;
        }
        
        //Verifica se o resultado é primo ou não
        if (cont == 2){
            System.out.println("o numero " + a + " é primo");
        } 
//            else{
//                System.out.println("o numero " + a + " não é primo");
//            }   
        cont = 0;
    }
               
  }
}
