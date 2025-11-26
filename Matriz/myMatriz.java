package com.mycompany.mymatriz;

import java.util.Scanner;

public class Mymatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Matriz 3x4: 3 linhas (1 cabecalho + 2 alunos), 4 colunas (Nome, nota1, nota2, media)
        String[][] myMatriz = new String[3][4];

        // Definindo o cabeçalho manualmente
        myMatriz[0][0] = "Nome";
        myMatriz[0][1] = "nota1";
        myMatriz[0][2] = "nota2";
        myMatriz[0][3] = "media";

        // Loop para preencher os dados dos alunos (começa em i=1 para pular o cabeçalho)
        // Condição do loop corrigida para i < 3 (para 2 alunos)
        for (int i = 1; i < 3; i++) {
            System.out.println("--- Dados do Aluno " + i + " ---");
            System.out.print("Nome: ");
            myMatriz[i][0] = sc.nextLine();

            // Loop interno para as notas e a média (j vai de 1 a 3, incluindo a média)
            for (int j = 1; j < 4; j++) {
                // j=1 é nota1, j=2 é nota2, j=3 é media
                System.out.print(myMatriz[0][j] + ": ");
                myMatriz[i][j] = sc.nextLine(); // Apenas lê a string fornecida pelo usuário
            }

            System.out.println("\n");
        }

        // --- Parte para exibir a tabela final ---

        System.out.println("--- Boletim Final ---");
        // Loop para imprimir toda a matriz, incluindo o cabeçalho
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz[i].length; j++) {
                // Usa formatação para alinhar as colunas
                System.out.printf("%-10s", myMatriz[i][j]);
            }
            System.out.println(); // Pula para a próxima linha
        }
        
        sc.close(); // Boa prática fechar o scanner
    }
}
