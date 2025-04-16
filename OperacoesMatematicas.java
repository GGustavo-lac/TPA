/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoesmatematicas;

/**
 *
 * Algoritmos de operações matemáticas feitas por gustavo lacerda
 */
public class OperacoesMatematicas {


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
       //exibir os resultados
       System.out.println("Resultados das operações:");
       System.out.println("Soma:" + soma);
       System.out.println("Subtração:"+ subtracao);
       System.out.println("Multiplicação:"+ multiplicacao);
       System.out.println("Divisão:"+ (num2 != 0 ? divisao: "Indefinida (divisão por zero)"));
       System.out.println("Resto da divisão"+ resto);
    
}
}

