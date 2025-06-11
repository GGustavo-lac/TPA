
package antecessorsucessor;
import javax.swing.*;
public class AntecessorSucessor {

  
    public static void main(String[] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        JOptionPane.showMessageDialog(null, "Antecessor: " + antecessor + "\nSucessor: " + sucessor);
    }
    
}
