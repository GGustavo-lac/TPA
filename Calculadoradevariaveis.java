

package com.mycompany.calculadoradevariaveis;

import java.util.Scanner;
public class Calculadoradevariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();

        // Operações
        double soma = a + b;
        double subtracao = a - b;
        double multiplicacao = a * b;

        // Verifica se pode dividir
        if (b != 0) {
            double divisao = a / b;
            System.out.println("\n--- Resultados ---");
            System.out.println("Soma: " + soma);
            System.out.println("Subtracao " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
            System.out.println("Divisao: " + divisao);
        } else {
            System.out.println("\n--- Resultados ---");
            System.out.println("Soma: " + soma);
            System.out.println("Subtracao: " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
            System.out.println("Divisao: Erro - divisao por zero.");
        }

        scanner.close();
    }
}

