package com.mycompany.switchcase2;

import java.util.Scanner;

public class Switchcase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de transporte
        System.out.println("Digite o meio de transporte:");
        System.out.println("1 - Onibus urbano R$ 4,40");
        System.out.println("2 - Metro R$ 5,00");
        System.out.println("3 - Trem intermunicipal R$ 6,50");
        System.out.println("4 - Onibus rodoviario R$ 12,00");
        System.out.print("Digite o numero: ");
        int opcaoTransporte = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int qtd = scanner.nextInt();

        double total;
        switch (opcaoTransporte) {
            case 1:
                total = qtd * 4.40;
                System.out.printf("Valor total da compra: R$ %.2f%n", total);
                break;
            case 2:
                total = qtd * 5.00;
                System.out.printf("Valor total da compra: R$ %.2f%n", total);
                break;
            case 3:
                total = qtd * 6.50;
                System.out.printf("Valor total da compra: R$ %.2f%n", total);
                break;
            case 4:
                total = qtd * 12.00;
                System.out.printf("Valor total da compra: R$ %.2f%n", total);
                break;
            default:
                System.out.println("Opcao invalida, tente novamente!");
        }

        // Menu bancário
        double saldo = 1000.00;
        int opcao;
        do {
            System.out.println("\nMenu de atendimento bancario:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Erro: saldo insuficiente!");
                    } else if (saque <= 0) {
                        System.out.println("Erro: Valor inválido");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para deposito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Erro: valor invalido!");
                    } else {
                        saldo += deposito;
                        System.out.printf("Deposito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Atendimento encerrado.");
                    break;
                default:
                    System.out.println("Operacao inexistente");
            }
        } while (opcao != 4);

        // Menu faixa etária
        int idade;
        do {
            System.out.print("\nDigite sua idade (ou um valor negativo para sair): ");
            idade = scanner.nextInt();

            if (idade < 0) {
                System.out.println("Programa encerrado. Até logo!");
                break;
            }

            int faixa;
            if (idade <= 12) {
                faixa = 1; // criança
            } else if (idade <= 17) {
                faixa = 2; // adolescente
            } else if (idade <= 59) {
                faixa = 3; // adulto
            } else {
                faixa = 4; // idoso
            }

            switch (faixa) {
                case 1:
                    System.out.println("Voce e uma CRIANcA (0–12 anos).");
                    break;
                case 2:
                    System.out.println("Voce e um ADOLESCENTE (13–17 anos).");
                    break;
                case 3:
                    System.out.println("Voce e um ADULTO (18–59 anos).");
                    break;
                case 4:
                    System.out.println("Voce e um IDOSO (60+ anos).");
                    break;
                default:
                    System.out.println("Erro inesperado.");
            }

        } while (idade >= 0);

        scanner.close();
    }
}

