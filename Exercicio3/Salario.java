package Exercicio3;

public class Salario {
  
  private double salario, aumento;

  public double calcularAumento(double sal, double aumento) {
    this.salario = sal;
    this.aumento = (1 + aumento / 100);
    return this.salario * this.aumento;
  }
}
