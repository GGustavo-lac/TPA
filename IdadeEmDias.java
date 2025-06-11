
package idade.em.dias;

import javax.swing.*;
public class IdadeEmDias {

  
    public static void main(String[] args) {
     int anos = Integer.parseInt(JOptionPane.showInputDialog("Informe os anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Informe os meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe os dias:"));

        int totalDias = (anos * 365) + (meses * 30) + dias;

        JOptionPane.showMessageDialog(null, "Total em dias: " + totalDias);
    }
    
}
