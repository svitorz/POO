package IF_Exercicio_1;

import javax.swing.JOptionPane;

public class PrincipalMedia {
  public static void main(String args[]) {
      Media media = new Media();

      JOptionPane.showMessageDialog(null, 
        "A situação do aluno é: " + media.calcular(
          Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: ")),
          Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "))
        )
      );

    System.out.println("Fim da execução.");
  }
}
