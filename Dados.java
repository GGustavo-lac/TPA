/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dados;

 import java.util.Scanner;
public class Dados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lê os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite sua serie: ");
        String serie = scanner.nextLine();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Exibe os dados informados
        System.out.println("\n--- Dados do Usuario ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Serie: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}

    

