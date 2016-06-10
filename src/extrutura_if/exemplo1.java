

package extrutura_if;

import java.util.Scanner;

public class exemplo1 {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        
//        if (a > b) {
//            System.out.println(a + " > " + b);
//            System.out.println("CORRETO !!!");
//        } else {
//            System.out.println("INCORRETO!!!");
//    }

//      Scanner entrada = new Scanner(System.in);
//      System.out.println("Digite n1: ");
//           float a = entrada.nextInt();
//           float c = a % 1;
//                if (c == 0) {
//            System.out.println("ESTE NUMERO É INTEIRO !!!");
//        } else {
//            System.out.println("ESTE NÚMERO NÂO É INTEIRO !!!");
//    }  
//        
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite n1: ");
//           int a = entrada.nextInt();
//               if (a >= 0) {
//            System.out.println("ESTE NUMERO É POSITIVO !!!");
//        } else {
//            System.out.println("ESTE NÚMERO É NEGATIVO !!!");
//    }  
// TESTAR O RESTO
//              Scanner entrada = new Scanner(System.in);
//              System.out.println("DIGITE O ANO : ");
//                int ANO = entrada.nextInt();
//                float RESTO = ( ANO % 4 );
//                    if (RESTO == 0) {
//                        System.out.println("ESTE ANO É BISCESTO");                 
//                    } else {
//                        System.out.println("ESTE ANO NÃO É BISCESTO");
//                    }
            
                    Scanner ent = new Scanner(System.in);
                    
                    System.out.println("nota n1: ");
                    float a = ent.nextInt();
                    System.out.println("nota n2: ");
                    float b = ent.nextInt();
                    System.out.println("nota n3: ");
                    float c = ent.nextInt();
                    
                    float media = ((a*4)+(b*5)+(c*6))/15;
                    
                    if (media >= 70) { System.out.println("Este ALUNO eatá APROVADO : " + media );
                                     } else if (media < 30) { System.out.println("Eeste ALUNO está REPROVADO : " + media );
                                                            } else { System.out.println("Digite a NOTA de RECUPERAÇÃO : ");
                                                                   float rec = ent.nextInt();
                                                                   float medfin = (media+rec)/2;
                                                                   if (medfin>=50) { System.out.println("Aluno APROVADO com a NOTA da RECUPERAÇÃO : " + medfin );
                                                                                   } else { System.out.println("Este ALUNO está REPROVADO mesmo com a NOTA da da RECUPERAÇÃO : " + medfin );
                                                                                          }
                                                                   }
     
    
    
    
    
    
    
    }
}
  
