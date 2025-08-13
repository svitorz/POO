package Exercicio1;

public class Cliente {

  private String nome, rg;

  public String Mostrar(String nome, String rg) {
    this.nome = nome;
    this.rg = rg;

    return "O nome informado é " + this.nome + " e o RG informado é: " + this.rg;
  }

  public String mostrarNome(String nome) {
    this.nome = nome;

    return "O nome informado foi: " + this.nome;
  }
}

