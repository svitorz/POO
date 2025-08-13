package Exercicio3;

import javax.swing.JOptionPane;

public class PrincipalSalario {
  public static void main(String args[]) {
      Salario salario = new Salario();

    JOptionPane.showMessageDialog(null, "O novo salário é de: " + salario.calcularAumento(
      Double.parseDouble(JOptionPane.showInputDialog("Insira o salário atual: ")),
          Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem de aumento do salário: "))
    ));
  } 
}
