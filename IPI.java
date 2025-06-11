
package ipi;
import javax.swing.*;

public class IPI {

    
    public static void main(String[] args) {
         double ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite o IPI (%):"));

        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Código peça 1:"));
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário peça 1:"));
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade peça 1:"));

        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Código peça 2:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário peça 2:"));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade peça 2:"));

        double total = (valor1 * quant1 + valor2 * quant2) * (1 + ipi / 100);

        JOptionPane.showMessageDialog(null, "Valor total com IPI: R$" + total);
    }
    
}
