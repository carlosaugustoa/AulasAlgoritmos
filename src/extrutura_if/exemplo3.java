package extrutura_if;

import java.util.Scanner;

public class exemplo3 {

    public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in);
 
    boolean logado = false;
    
    System.out.print("Login: ");
    
    String login = entrada.next();
    
    System.out.print("Senha: ");
    
    String senha = entrada.next();
    
    if (login.equals("carlos") && senha.equals("12345")) {
      logado = true;
    }
    
    if (!logado) {
        System.out.println("Usuario ou Senha Inválidas!");
    } else {
        System.out.println("Usuário LOGADO!!!'");
    }
    }
}

