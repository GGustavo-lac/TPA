
package frutas;
import java.util.Scanner;
public class Frutas {

     public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 3: ");
            int resposta = scanner.nextInt();
            
            switch (resposta) {
                case 1 -> System.out.println("Maça");
                case 2 -> System.out.println("Banana");
                case 3 -> System.out.println("Laranja");
                default -> System.out.println("Fruta inválida!");
            }
        }
    }
}
   
