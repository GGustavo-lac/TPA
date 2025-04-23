
package operacoesmatematicasbylacerda;

/**
 *
 * Operações Matemáticas feitas por Gustavo Lacerda na sala 111
 */
public class Operacoesmatematicasbylacerda {

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
       int comprimento,quadrado_area;
       //comprimento do quadrado em cm
       comprimento = 20;
       //calcular área do quadrado
       quadrado_area = comprimento * comprimento;
       int base, altura,retangulo_area;
       base = 2;//base do retangulo em cm
       altura= 4; // altura do retangulo em cm
      retangulo_area = base* altura; //calcular area do retangulo
       int DiagonalM , diagonalm,dividir_los,losango_area;
       DiagonalM = 6;//diagonal maior em cm
       diagonalm = 4;//diagonal menor em cm
       dividir_los = 2;//divisão por 2
       losango_area = DiagonalM * diagonalm / dividir_los; // calculo área do losango
       int base_t, altura_t, dividir_tri, triangulo_area;
       base_t = 4; // Base Triangulo
       altura_t = 2; // altura triangulo
       dividir_tri = 2; // dividir triangulo
       triangulo_area = base_t * altura_t / dividir_tri;
       double raio = 10; // raio da circunferencia
        double circunferencia_area; 
        final double pi= 3.14; // valor de pi
        circunferencia_area = pi*(raio*raio); // calculo area da circunferencia
        float n1, n2, n3, n4,n5,n6,n7,n8,n9,n10 ,Media;
        n1 = 1; //variaveis
        n2 = 2;
        n3 = 3; 
        n4= 6;
        n5 = 8;
        n6 = 3;
        n7= 3 ;
        n8 = 9;
        n9 = 3;
        n10 = 4;
        Media = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/4;//calculo da media
       //exibir os resultados
       System.out.println("Resultados das operacoes:");
       System.out.println("Soma:" + soma);
       System.out.println("Subtracao:"+ subtracao);
       System.out.println("Multiplicacao:"+ multiplicacao);
       System.out.println("Divisao:"+ (num2 != 0 ? divisao: "Indefinida (divisão por zero)"));
       System.out.println("Resto da divisao"+ resto);
      System.out.println("Area do quadrado : " + quadrado_area);
      System.out.println("Area do retangulo : " + retangulo_area);
      System.out.println("Area do losango:" + losango_area);
      System.out.println("Area do triangulo:"+ triangulo_area);
      System.out.println("Area da circunferencia:"+ circunferencia_area);
      System.out.println("Media dos valores:"+ Media);
   }    
   
}
