
package mediadenumeros;
import javax.swing.*;

public class Mediadenumeros {
  public static void main(String[] args) {
        // Primeira média
        int n1 = 8, n2 = 9, n3 = 7;
        double media1 = (n1 + n2 + n3) / 3.0;

        // Segunda média
        int n4 = 4, n5 = 5, n6 = 6;
        double media2 = (n4 + n5 + n6) / 3.0;

        // Soma das médias
        double somaMedias = media1 + media2;

        // Média das médias
        double mediaDasMedias = somaMedias / 2.0;

        // Mensagem com os resultados
        String mensagem = String.format(
            "Média dos números 8, 9, 7: %.2f\n" +
            "Média dos números 4, 5, 6: %.2f\n" +
            "Soma das médias: %.2f\n" +
            "Média das médias: %.2f",
            media1, media2, somaMedias, mediaDasMedias
        );

        // Exibir mensagem
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

  
      

