
package operacoescomprimos;
import java.util.Scanner;
public class OperacoesComPrimos {

   
    public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);

        // Ler o primeiro número
        System.out.print("Digite o  numero: ");
        int numero1 = scanner.nextInt();

        // Verificar se o primeiro número é primo
        if (ePrimo(numero1)) {
            System.out.println(numero1 + " é um numero primo.");
        } else {
            System.out.println(numero1 + " nao e um numero primo.");
        }

      

      
        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}