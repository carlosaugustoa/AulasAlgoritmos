package lista2;

import java.util.Scanner;

public class resposta2 {
    
    public static void main(String[] args) {  

    Scanner ent = new Scanner(System.in);
 
//    System.out.print("Digite a Altura da Pessoa: ");
//        
//        float altura = ent.nextFloat();
//        //float peso = (float) ((72.7 * altura) - 58);
//        float peso = (72.7f * altura) - 58;
//    
//        System.out.println("Seu peso é : " + peso );    
//     Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a sua altura: ");
        
        float altura = ent.nextFloat();
        
        float peso = (72.7f * altura) - 58;
        
        System.out.println("Peso ideal: " + peso);  
        
        ent.close();
    
    }

}
