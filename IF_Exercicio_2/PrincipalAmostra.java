package IF_Exercicio_2;

import javax.swing.JOptionPane;

public class PrincipalAmostra {
  public static void main(String args[]) {
    Amostra amostra = new Amostra();
    JOptionPane.showMessageDialog(null, "O solo está " + amostra.verificarAmostra(
      Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o tipo da amostra"))
    ));
  }
}
