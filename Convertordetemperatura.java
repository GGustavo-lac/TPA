
package convertordetemperatura;
import java.util.Scanner;

public class Convertordetemperatura {

  
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Celsius para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Celsius para Kelvin
        double kelvin = celsius + 273.15;

        System.out.println("Conversao:");
        System.out.println("Graus Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }
}

    
    

