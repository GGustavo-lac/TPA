

package com.mycompany.jogos;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 5: ");
            int games = scanner.nextInt();
            
            switch (games) {
                case 1 -> System.out.println("Minecraft");
                case 2 -> System.out.println("Ea Fc");
                case 3 -> System.out.println("Fortnite");
                case 4 -> System.out.println("Call of duty");
                case 5 -> System.out.println("The sims");
                default -> System.out.println("Jogo não encontrado");
            }
           }
                     try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int semana = scanner.nextInt();
            switch (semana) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda-feira");
                case 3 -> System.out.println("Terça-feira");
                case 4 -> System.out.println("Quarta-feira");
                  case 5 -> System.out.println("Quinta-feira");
                    case 6 -> System.out.println("Sexta-feira");
                      case 7 -> System.out.println("Sábado");
                default -> System.out.println("Dia inválido! ");
                
            }
        }
                      try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 3: ");
            int frutas = scanner.nextInt();
            
            switch (frutas) {
                case 1 -> System.out.println("Maça");
                case 2 -> System.out.println("Banana");
                case 3 -> System.out.println("Laranja");
                default -> System.out.println("Fruta inválida!");
    }
    
}
    }
}

 

    

