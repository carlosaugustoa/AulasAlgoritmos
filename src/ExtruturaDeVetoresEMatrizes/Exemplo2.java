package ExtruturaDeVetoresEMatrizes;

import java.util.Scanner;

public class Exemplo2 {
    
   public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);

// Minha versão    
//
//    String nome[] = new String[3];
//    int nota[][] = new int[3][4];
//    int soma[] = new int[3];
//       
//    for (int i = 0; i <nome.length; i++){
//        
//        System.out.print("Nome " + (i+1) + ": ");
//        nome[i] = ent.next();
//    
//        for (int j = 0; j < 4; j++) {
//            System.out.print("Notas " + (j+1) + " de " + nome[i] + ": ");
//            nota[i][j] = ent.nextInt();
//            if ((nota[i][j] < 0) || (nota[i][j] > 10)) j--;
//                else soma[i] = soma[i] + nota[i][j];
//        }
//            System.out.println("A média de " + nome[i] + " é: " + (soma[i]/4));     
//            if ((soma[i]/4) >= 7){System.out.println(" APROVADO !!!");
//            }
//               else {System.out.println("Reprovado !!!");
//               }
//     
//    }  
    

    
    
// Exemplo 1 Professor    
//
//        String nome[] = new String[3];
//        int nota[][] = new int[3][4];
//
//    for (int i = 0; i <nome.length; i++){
//        
//        System.out.print("Nome " + (i+1) + ": ");
//        nome[i] = ent.next();
//    
//        for (int j = 0; j < 4; j++) {
//            System.out.print("Notas " + (j+1) + " de " + nome[i] + ": ");
//            nota[i][j] = ent.nextInt();
//        }
//    }  
//        float medias[] = new float[3];
//        int z = 0;
//    
//    while(z<3){
//        medias[z] = (nota[z][0]+nota[z][1]+nota[z][2]+nota[z][3])/4;
//        if (medias[z] >= 7){
//            System.out.println(nome[z] + " -> APROVADO");
//        }   else {
//                System.out.println(nome[z] + " -> REPROVADO");
//            }
//            z++;
//    }

    
    
// Exemplo 2 Professor    

        String nomes[] = new String[2];
        int notas[][] = new int[2][3];
    
    for (int i = 0; i <nomes.length; i++){
        
        System.out.print("Nome " + (i+1) + ": ");
        nomes[i] = ent.next();
    
        for (int j = 0; j < 3; j++) {
            System.out.print("Notas " + (j+1) + " de " + nomes[i] + ": ");
            notas[i][j] = ent.nextInt();
        }
    }
    
    for (String nome : nomes){
        
        System.out.print(nome);
        
        for (int[] nota : notas){
            
            System.out.print(nota);
        }    
   }   

//        nome[i] = ent.next();
//    
//        for (int j = 0; j < 4; j++) {
//            System.out.print("Notas " + (j+1) + " de " + nome[i] + ": ");
//            nota[i][j] = ent.nextInt();
//        }
//    }  
//        float medias[] = new float[3];
//        int z = 0;
//    
//    while(z<3){
//        medias[z] = (nota[z][0]+nota[z][1]+nota[z][2]+nota[z][3])/4;
//        if (medias[z] >= 7){
//            System.out.println(nome[z] + " -> APROVADO");
//        }   else {
//                System.out.println(nome[z] + " -> REPROVADO");
//            }
//            z++;
//    }  
   
    
   }
}

