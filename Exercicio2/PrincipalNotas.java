package Exercicio2;

import javax.swing.JOptionPane;

public class PrincipalNotas {

  public static void main(String args[]) {
      
    Notas notas = new Notas();

    JOptionPane.showMessageDialog(null, "Vamos calcular médias ponderadas! Insira 3 notas, e em seguida, 3 pesos.");
    JOptionPane.showMessageDialog(null, notas.calcularMediaPonderada(
        Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: ")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 1: ")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 2: ")), 
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 3: ")) 
      ) 
    ); 
  }

}
