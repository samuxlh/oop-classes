public class Carro {

  private String renavam;
  private String modelo;
  private String marca;
  private String placa;

  public void setRenavam(String renavam) throws CarroExceptions {
    if (renavam.length() > 10) {
      this.renavam = renavam;
    } else {
		throw new CarroExceptions();
	}
  }

  public void setModelo(String modelo) throws CarroExceptions {
    if (modelo.length() <= 30) {
      this.modelo = modelo;
    } else {
      throw new CarroExceptions();
    }
  }

  public void setMarca(String marca) throws CarroExceptions {
    if (marca.length() <= 30) {
      this.marca = marca;
    } else {
      throw new CarroExceptions();
    }
  }

  public void setPlaca(String placa) throws CarroExceptions {
    if (placa.length() == 7) {
      this.placa = placa;
    } else {
      throw new CarroExceptions();
    }
  }

  public Carro() {
    renavam = "";
    modelo = "";
    marca = "";
    placa = "";
  }

  public String getRenavam() {
    return renavam;
  }

  public String getModelo() {
    return modelo;
  }

  public String getMarca() {
    return marca;
  }

  public String getPlaca() {
    return placa;
  }
}
