package lista5;

import java.util.Scanner;

public class resposta2{

    public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);
    
            String nome = "a";
            String senha = "a";
    
        while (senha.equalsIgnoreCase(nome)) {
            System.out.print("Digite Nome do Usuário: ");
                nome = ent.next();
            System.out.print("Digite sua Senha: ");
                senha = ent.next();
       
            if (senha.equals(nome)){
            } 
                else {
                    System.out.print("Senha Invalida !!!\n");
                }
        }
    }
}
