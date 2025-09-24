import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Exibir todos os números pares entre 1 e 20
        System.out.println("1) Números pares entre 1 e 20:");
        exibirNumerosPares();

        // 2) Efetuar a tabuada do número informado
        System.out.print("\n2) Digite um número para ver a tabuada: ");
        int numTabuada = sc.nextInt();
        tabuada(numTabuada);

        // 3) Exibir a quantidade de números existentes entre 100 e 125
        System.out.println("\n3) Quantidade de números entre 100 e 125:");
        quantidadeNumerosEntre();

        // 4) Soma dos números ímpares entre valores informados
        System.out.print("\n4) Digite o valor inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();
        somaImpares(inicio, fim);

        sc.close();
    }

    // 1) Exibir todos os números pares entre 1 e 20
    public static void exibirNumerosPares() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // quebra de linha
    }

    // 2) Efetuar a tabuada do número informado
    public static void tabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 3) Exibir a quantidade de números existentes entre 100 e 125
    public static void quantidadeNumerosEntre() {
        int contagem = 0;
        for (int i = 100; i <= 125; i++) {
            contagem++;
        }
        System.out.println("Existem " + contagem + " números entre 100 e 125.");
    }

    // 4) Através de um valor inicial e final, apresentar a soma dos números ímpares
    public static void somaImpares(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) { // verifica se é ímpar
                soma += i;
            }
        }
        System.out.println("A soma dos números ímpares entre " + inicio + " e " + fim + " é: " + soma);
    }
}
