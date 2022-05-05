public class CarroExceptions extends Exception {

  public void RenavamInvalido() {
    System.out.println("O número inserido é inválido.");
  }

  public void ModeloInvalido(String dado) {
    if (dado.length() > 32) {
      System.out.println("O modelo deve ter no máximo 32 caracteres.");
    }
  }

  public void MarcaInvalida(String dado) {
    if (dado.length() > 24) {
      System.out.println("A marca deve ter no máximo 24 caracteres.");
    }
  }

  public void PlacaInvalida(String dado) {
    if (dado.length() != 7) {
      System.out.println("A placa deve ter 7 caracteres.");
    }
  }
}
