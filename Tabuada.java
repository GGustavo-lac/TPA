
package tabuada;

 import java.util.Scanner;
public class Tabuada {

    
   



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número do usuário
        System.out.print("Digite um numero para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}

    
