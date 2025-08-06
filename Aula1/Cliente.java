package Aula1;

import javax.swing.JOptionPane;

public class Cliente {

  private String nome, rg;

  public void Mostrar(String nome, String rg) {
    this.nome = nome;
    this.rg = rg;

    this.printMessage("O nome informado é " + this.nome + " e o RG informado é: " + this.rg);
  }

  public void mostrarNome(String nome) {
    this.nome = nome;

    this.printMessage("O nome informado foi: " + this.nome);
  }

  private void printMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}

