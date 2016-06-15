package ExtruturaDeRepeticaowhile;

import java.util.Scanner;

public class Exemplo2 {

  public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
   
    int numero = 1;
    int soma = 0;
    float media = 0;
    int qtd =0;
    
    while (numero != 0){
        System.out.print("Digite um Números : ");
        numero = ent.nextInt();
        soma += numero;
        qtd++;
        
    }
    media = soma / (qtd - 1); 
    System.out.println("O soma total é de : " + soma + "  " + qtd + "\ne a Média é : " + media);
  }
}

