package Aula1;

public class Cliente {

  private String nome, rg;

  public void Mostrar(String nome, String rg) {
    this.nome = nome;
    this.rg = rg;

    System.out.println("O nome informado é " + this.nome + " e o RG informado é: " + this.rg);
  }

  public void mostrarNome(String nome) {
    this.nome = nome;

    System.out.println("O nome informado foi: " + this.nome);
  }
}

