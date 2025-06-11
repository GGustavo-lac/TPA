
package salariominimo;
import javax.swing.*;
public class Salariominimo {
    public static void main(String[] args) {
   double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário:"));

        double quantidade = salarioUsuario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "Você recebe " + quantidade + " salários mínimos.");
 
    
    }
    
}
