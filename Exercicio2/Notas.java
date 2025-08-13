package Exercicio2;

public class Notas {
  
  public double calcularMediaPonderada(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
    return ((nota1 / peso1) + (nota2 / peso2) + (nota3 / peso3));
  } 
}
