import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // definir matriz 3x4
        String[][] estoque = new String[3][4];
        
        // Ler as info colocadas
        for (int i = 0; i < 3; i++) {
            System.out.print("Produto: ");
            estoque[i][0] = sc.nextLine();
            
            System.out.print("Quantidade: ");
            estoque[i][1] = sc.nextLine();
            
            System.out.print("Preço: ");
            estoque[i][2] = sc.nextLine();
            
            // Calcular valor total
            double qtd = Double.parseDouble(estoque[i][1]);
            double preco = Double.parseDouble(estoque[i][2]);
            double total = qtd * preco;
            estoque[i][3] = String.format("%.2f", total);
            
            System.out.println();
        }
        
        // Mostrar tabela
        System.out.println("Produto         Quantidade      Preço           Valor Total");
        for (int i = 0; i < 3; i++) {
            System.out.print(estoque[i][0]);
            for (int j = estoque[i][0].length(); j < 16; j++) {
                System.out.print(" ");
            }
            System.out.print(estoque[i][1]);
            for (int j = estoque[i][1].length(); j < 16; j++) {
                System.out.print(" ");
            }
            System.out.print(estoque[i][2]);
            for (int j = estoque[i][2].length(); j < 16; j++) {
                System.out.print(" ");
            }
            System.out.println(estoque[i][3]);
        }
        
        sc.close();
    }
}
