import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // matriz 4x4 soma e média pares
        int[][] m1 = new int[4][4];
        int somaPares = 0, qtdPares = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = sc.nextInt();
                if (m1[i][j] % 2 == 0) {
                    somaPares += m1[i][j];
                    qtdPares++;
                }
            }
        }

        double mediaPares = (qtdPares > 0) ? (double) somaPares / qtdPares : 0;
        System.out.println("Soma pares: " + somaPares);
        System.out.println("Media pares: " + mediaPares);

        // matriz de letras
        char[][] letras = new char[5][5];
        char letra = 'a';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j] = letra++;
                System.out.print(letras[i][j] + " ");
            }
            System.out.println();
        }

        // matriz números inteiros fixa
        int[][] numB = {
                {19, 25, 100, 99},
                {10, 7, 25, 14},
                {35, 2, 47, 74}
        };

        for (int[] linha : numB) {
            for (int n : linha) System.out.print(n + " ");
            System.out.println();
        }

        // matriz decimal fixa
        double[][] numC = {
                {1.9, 2.5, 10.0},
                {1.0, 7.8, 2.5},
                {3.5, 2.2, 4.7}
        };

        for (double[] linha : numC) {
            for (double n : linha) System.out.print(n + " ");
            System.out.println();
        }

        // matriz 5x5 com somas
        int[][] m3 = new int[5][5];
        int somaImpares = 0;
        int[] somaLinhas = new int[5];
        int[] somaColunas = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m3[i][j] = sc.nextInt();

                if (m3[i][j] % 2 != 0) somaImpares += m3[i][j];

                somaLinhas[i] += m3[i][j];
                somaColunas[j] += m3[i][j];
            }
        }

        System.out.println("Soma impares: " + somaImpares);

        for (int i = 0; i < 5; i++) System.out.println("Linha " + i + ": " + somaLinhas[i]);
        for (int j = 0; j < 5; j++) System.out.println("Coluna " + j + ": " + somaColunas[j]);

        // matriz 3x5 repetidos, pares e ímpares
        int[][] m4 = new int[3][5];
        boolean repetido = false;
        int pares = 0, impares = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                m4[i][j] = sc.nextInt();

                if (m4[i][j] % 2 == 0) pares++;
                else impares++;

                for (int x = 0; x <= i; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (x == i && y >= j) break;
                        if (m4[x][y] == m4[i][j]) repetido = true;
                    }
                }
            }
        }

        System.out.println("Repetidos: " + (repetido ? "sim" : "nao"));
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        // matriz 4x4 diagonal principal e secundária
        double[][] m5 = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m5[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) System.out.print(m5[i][i] + " ");
        System.out.println();

        for (int i = 0; i < 4; i++) System.out.print(m5[i][3 - i] + " ");
        System.out.println();

        // figura cheia
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print("* ");
            System.out.println();
        }

        // figura moldura
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        // figura triângulo
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        sc.close();
    }
}
