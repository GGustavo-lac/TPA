
package reajustesaldo;
import javax.swing.*;

public class Reajustesaldo {

 
    public static void main(String[] args) {
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo atual:"));
        double reajuste = saldo * 0.01;
        double novoSaldo = saldo + reajuste;

        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1%: R$" + novoSaldo);
    }
    
}
