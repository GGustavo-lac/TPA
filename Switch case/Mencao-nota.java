package com.mycompany.Mencao;
import java.util.Scanner;

public class Mencao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 10: ");
            int resposta = scanner.nextInt();
            
            switch (resposta) {
                case 1, 2,3,4 -> System.out.println("Você tirou um I");
                case 5, 6 -> System.out.println("Você tirou um R");
                case 7, 8 -> System.out.println("Você tirou um B");
                case 9, 10 -> System.out.println("Você tirou um MB");
                default -> System.out.println("Valor inválido! Digite de 1 a 10.");
            }
        }
    }
}
