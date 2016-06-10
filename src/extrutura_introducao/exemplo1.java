package extrutura_introducao;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        
        System.out.print("Olá mundo!!!");
        System.out.println("Oi, novamente!!!");
      
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("digite seu nome : ");
        nome = entrada.next();
        System.out.println("BEM VINDO, " + nome + "!");
                
    }
}
