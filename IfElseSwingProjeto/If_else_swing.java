
package com.mycompany.if_else_swing;
import javax.swing.*;

public class If_else_swing {

    public static void main(String[] args) {
        //Definir valor 1 e 2, usando double
       double valor1 = Double.parseDouble(JOptionPane.showInputDialog("DIgite o primeiro valor:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
 // >= Significa maior ou igual
 //condição se
        if (valor1 >= valor2) 
     
 JOptionPane.showMessageDialog(null, "Primeiro valor é maior ou igual que o segundo");
        //condição senão
 else
     JOptionPane.showMessageDialog(null, "Primeiro valor é menor que o segundo");
  //Usar double para definir valores 3 e 4
        double valor3 = Double.parseDouble(JOptionPane.showInputDialog("DIgite o terceiro valor:"));
        double valor4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor:"));
 //Condição se 
 //<= significa menor ou igual 
        if (valor3 <= valor4) 
     
     
      
         JOptionPane.showMessageDialog(null, "Terceiro valor é menor ou igual ao quarto");
        //condição senão
 else
     JOptionPane.showMessageDialog(null, "Terceiro valor é maior que o quarto");
        //Condição senão
        //Significa Diferente !=
if (valor4 != valor1 )
JOptionPane.showMessageDialog(null, "Quarto valor é diferente do primeiro");
//condição senão
else 
JOptionPane.showMessageDialog(null, "Quarto valor é igual ao primeiro");
//usar double para definir valor 5 e 6
double valor5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto valor"));
double valor6 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Sexto valor"));
//condição se
//Significa maior >
if (valor5 > valor6 )
JOptionPane.showMessageDialog(null, "Quinto valor é maior que o sexto");
//Condição senão
else 
JOptionPane.showMessageDialog(null, "Quinto valor não é maior que o sexto");
//Condição se
//Significa diferente <
if (valor6 < valor3 )
JOptionPane.showMessageDialog(null, "Sexto valor é menor que o terceiro");
//condição senão
else 
JOptionPane.showMessageDialog(null, "Sexto valor não é menor que o terceiro");
//Condição se
//Significa igual ==
if (valor5 == valor1 )
JOptionPane.showMessageDialog(null, "O quinto valor é igual ao primeiro");
//Condição senão
else 
JOptionPane.showMessageDialog(null, "quinto valor é diferente do primeiro");
// JOptionPane.showMessageDialog é usado para enviar uma mensagem caso a condição se concretize
    }
}
