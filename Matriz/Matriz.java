package com.mycompany.matriz;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = 5;
        double[][] A = new double[tamanho][tamanho];
        double[][] B = new double[tamanho][tamanho];
        double[][] soma = new double[tamanho][tamanho];
        double[][] subtracao = new double[tamanho][tamanho];
        double[][] multiplicacao = new double[tamanho][tamanho];
        double[][] divisao = new double[tamanho][tamanho];

        // Entrada da matriz A
        System.out.println("Digite os elementos da matriz A (5x5):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        // Entrada da matriz B
        System.out.println("Digite os elementos da matriz B (5x5):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                B[i][j] = sc.nextDouble();
            }
        }

        // Cálculo das operações
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                soma[i][j] = A[i][j] + B[i][j];
                subtracao[i][j] = A[i][j] - B[i][j];
                multiplicacao[i][j] = A[i][j] * B[i][j];
                divisao[i][j] = (B[i][j] != 0) ? A[i][j] / B[i][j] : 0;
            }
        }

        // Exibir os resultados
        System.out.println("\nMatriz A + B:");
        exibirMatriz(soma);

        System.out.println("\nMatriz A - B:");
        exibirMatriz(subtracao);

        System.out.println("\nMatriz A x B (elemento a elemento):");
        exibirMatriz(multiplicacao);

        System.out.println("\nMatriz A \\ B (elemento a elemento):");
        exibirMatriz(divisao);

        sc.close();
    }

    // Método para exibir matriz
    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
