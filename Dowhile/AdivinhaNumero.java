import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        // Criando o gerador de números aleatórios
        Random variavel = new Random();

        // Gerando o número secreto de 1 até 10 (inclusive)
        int numeroSecreto = variavel.nextInt(1, 11);

        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int tentativa;               // Armazena cada palpite
        int contadorTentativas = 0;  // Conta quantas tentativas foram feitas

        System.out.println("Tente adivinhar o número secreto entre 1 e 10!");

        // Repetir até acertar
        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            // Dicas: mais alto ou mais baixo
            if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é MAIS ALTO. Tente novamente!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é MAIS BAIXO. Tente novamente!");
            }

        } while (tentativa != numeroSecreto);

        // Quando acerta
        System.out.println("\nParabéns! Você acertou o número secreto!");
        System.out.println("O número secreto era: " + numeroSecreto);
        System.out.println("Você usou " + contadorTentativas + " tentativa(s).");

        scanner.close();
    }
}
