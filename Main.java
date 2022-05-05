//Samuel Cezar dos Santos | 1996789
//Prog. Orientada Objetos - ADS

public class Main {

  public static void main(String arg[]) throws CarroExceptions {
    Leitura l = new Leitura();
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("\n\nBem vindo usuario, o que deseja fazer?");
      System.out.println("1 - Inserir Carro");
      System.out.println("Escolha uma opcao");
      int opt = l.entradaInt();

      switch (opt) {
        case 1:
          Carro c1 = new Carro();
          System.out.println("\nFuncao escolhida | 1 - Inserir Carro\n");

          System.out.println("Insira o RENAVAM do veiculo:");

          Boolean nestedLoop = true;
          while (nestedLoop) {
            try {
              String renavamInput = l.entradaString();
              c1.setRenavam(renavamInput);
              nestedLoop = false;
            } catch (CarroExceptions ce) {
              ce.RenavamInvalido();
              System.out.println("Tente inserir outro valor.");
            }
          }

          System.out.println("Insira o MODELO do veiculo:");

          nestedLoop = true;
          while (nestedLoop) {
            try {
              String modeloInput = l.entradaString();
              c1.setModelo(modeloInput);
              nestedLoop = false;
            } catch (CarroExceptions ce) {
              ce.ModeloInvalido();
              System.out.println("Tente inserir outro valor.");
            }
          }

          System.out.println("Insira a MARCA do veiculo:");

          nestedLoop = true;
          while (nestedLoop) {
            try {
              String marcaInput = l.entradaString();
              c1.setMarca(marcaInput);
              nestedLoop = false;
            } catch (CarroExceptions ce) {
              ce.MarcaInvalida();
              System.out.println("Tente inserir outro valor.");
            }
          }

          System.out.println("Insira a PLACA do veiculo:");

          nestedLoop = true;
          while (nestedLoop) {
            try {
              String placaInput = l.entradaString();
              c1.setPlaca(placaInput);
              nestedLoop = false;
            } catch (CarroExceptions ce) {
              ce.PlacaInvalida();
              System.out.println("Tente inserir outro valor.");
            }
          }

          System.out.println("\nCarro inserido com sucesso!");

		  System.out.println("\n\nPressione:\n0 - Encerrar\n1 - Voltar ao inicio");
		  int opt2 = l.entradaInt();
		  if(opt2 == 0){
			  isRunning = false;
		  } else {
			  isRunning = true;
		  }
          break;
        case 2:
          System.out.println("A - B = ");
          break;
        case 3:
          System.out.println("A * B = ");
          break;
        case 4:
          System.out.println("A / B = ");
          break;
        default:
          System.out.println("Opcao invalida");
          break;
      }
    }
  }
}
