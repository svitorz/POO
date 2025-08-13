package IF_Exercicio_2;

public class Amostra {

  private int amostra;
  private String resposta;
  
  public String verificarAmostra(int amostra) {
    this.amostra = amostra;
    if(this.amostra <= 10){
      this.resposta = "rochoso";
    } else if ((this.amostra > 10) && (this.amostra <= 40)) {
      this.resposta = "firme";
    } else if ((this.amostra > 40) && (this.amostra <= 80)){
      this.resposta = "pantanoso";
    } else {
      this.resposta = "inválido";
    }

    return this.resposta;
  }
}



