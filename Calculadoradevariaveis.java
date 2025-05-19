
package calculadoradevariaveis;

public class Calculadoradevariaveis {

    public static void main(String[] args) {
        //Definir dois números
        double num1 = 15;
       double num2 = 3 ;
      // Fazer operações matemáticas
       double soma = num1+ num2;
       double subtracao = num1 - num2;
       double multiplicacao = num1 * num2;
       double divisao = num2 !=0 ? num1/num2 : Double.NaN; //evitar divisão por zero
       double resto = num1 % num2;
         System.out.println("Resultados das operacoes:");
       System.out.println("Soma:" + soma);
       System.out.println("Subtracao:"+ subtracao);
       System.out.println("Multiplicacao:"+ multiplicacao);
       System.out.println("Divisao:"+ (num2 != 0 ? divisao: "Indefinida (divisão por zero)"));
       System.out.println("Resto da divisao"+ resto);
    }
    
}
