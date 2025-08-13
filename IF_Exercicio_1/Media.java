package IF_Exercicio_1;

public class Media {
  
  private double nota1, nota2, mediaf;
  private String resposta;

  public String calcular(double nota1, double nota2) {

    this.nota1 = nota1;
    this.nota2 = nota2;

    this.mediaf = (this.nota1 + this.nota2) / 2; 

    if (this.mediaf >= this.mediaf) {
      this.resposta = "aprovado"; 
    } else {
      if((this.mediaf >= 6) && (this.mediaf < 6)){
        this.resposta = "recurepação";
      } else {
        this.resposta = "reprovado";
      }
    }

    return this.resposta;
  }

}
