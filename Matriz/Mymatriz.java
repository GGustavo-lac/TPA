
package com.mycompany.mymatriz;

import java.util.Scanner;
public class Mymatriz {
//desafio nao pedir media pra retornar depois no calculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String [][] myMatriz =  new String [3][4];
      {
 myMatriz[0][0] = "Nome";
  myMatriz[0][1] = "nota1";
   myMatriz[0][2] = "nota2";
    myMatriz[0][3] = "media";
      for (int i = 1;i < 3;i++){
                System.out.print("Nome: ");
          myMatriz[i][0] = sc.nextLine();
            System.out.print("nota1: ");
          myMatriz[i][1] = sc.nextLine();
            System.out.print("nota2: ");
          myMatriz[i][2] = sc.nextLine();
            System.out.print("media: ");
          myMatriz[i][3] = sc.nextLine();
          System.out.println("\n");
      
      }
          for (int i = 1;i < 4;i++){
      
          System.out.print("Nome: ");
          myMatriz[i][0] = sc.nextLine();
            System.out.print("nota1: ");
          myMatriz[i][1] = sc.nextLine();
            System.out.print("nota2: ");
          myMatriz[i][2] = sc.nextLine();
            System.out.print("media: ");
          myMatriz[i][3] = sc.nextLine();
          System.out.println("\n");
      }
         }
     }
}

            
      
   
