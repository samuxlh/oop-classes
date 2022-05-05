//Samuel Cezar dos Santos | 1996789
//Prog. Orientada Objetos - ADS

public class CarroExceptions extends Exception {

  public void RenavamInvalido() {
    System.out.println(
      "O numero inserido deve possuir 7 caracteres no maximo."
    );
  }

  public void ModeloInvalido() {
    System.out.println("O modelo deve ter no maximo 32 caracteres.");
  }

  public void MarcaInvalida() {
      System.out.println("A marca deve ter no maximo 24 caracteres.");
  }

  public void PlacaInvalida() {
      System.out.println("A placa deve ter 7 caracteres.");
  }
}
