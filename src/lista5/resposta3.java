package lista5;

import java.util.Scanner;

public class resposta3{

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);    
        
            int qtlnome = 0;
        while (qtlnome < 4) {
            System.out.print("Digite um Nome: ");
            String nome = ent.next();
            qtlnome = nome.length();    
        }
            int idade = 200;
        while (idade < 0 || idade > 150) {            
            System.out.print("Digite uma Idade : ");
            idade = ent.nextInt();
            if (idade < 0 || idade > 150) {
            System.out.println("Idade invalida!!!");
            }
        }
            int salario = 0;
        while (salario <= 0){    
            System.out.print("Digite um Salário: ");
            salario = ent.nextInt();
            if (salario <= 0){
            System.out.println("Salário invalido!!!");
            }    
        }
            int volta = 1;
        while (volta == 0){
            System.out.print("Digite Sexo: "); 
                String sexo = ent.next();
            if (sexo.equalsIgnoreCase("m")){
               volta = 0;
            }
            if (sexo.equalsIgnoreCase("f")){
                volta = 0;
            }
            if (volta == 1 ){
                System.out.println("Sexo invalido!!!");
            }
        }    
            int aux = 0;             
        while (aux == 0) {
            System.out.print("Digite Estado Civil: ");
            String estciv = ent.next();
            switch (estciv){
                case "s" :
                    aux = 1;
                    break;
                case "c" :
                    aux = 1;
                    break;
                case "v" :
                    aux = 1;
                    break;
                case "d" :
                    aux = 1;
                    break;
                default:
                    aux = 0;
                    System.out.println("Estado Civil Inválido !!!");
                    break;
            }
        }
            
        
    }
}
