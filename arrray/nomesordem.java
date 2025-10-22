import java.util.Scanner;
import java.util.Arrays;

public class NomesOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nomes deseja digitar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        String[] nomes = new String[qtd];

        // leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        // ordem crescente
        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem crescente:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // ordem decrescente
        System.out.println("\nNomes em ordem decrescente:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
