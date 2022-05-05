public class GestorCarros {

	public static void main(String arg[]) throws CarroExceptions {

		Leitura l = new Leitura();
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("\n\nBem vindo usuario, o que deseja fazer?");
			System.out.println("0 - Encerrar programa");
			System.out.println("1 - Inserir Carro");
			System.out.println("Escolha uma opcao");
			int opt = l.entradaInt();

			switch (opt) {
				case 0:
					System.out.println("Até mais!");
					isRunning = false;
				case 1:
					Carro c1 = new Carro();
					System.out.println("\nFuncao escolhida | 1 - Inserir Carro\n");
					
					System.out.println("Insira o RENAVAM do veiculo:");
					try {
						String renavamInput = l.entradaString();
						c1.setRenavam(renavamInput);
					} catch (CarroExceptions ce) {
						ce.RenavamInvalido();
					}
					
					// System.out.println("Insira o MODELO do veiculo:");
					// String modelo = l.entradaString();
					// c1.setModelo(modelo);
					
					// System.out.println("Insira a MARCA do veiculo:");
					// String marca = l.entradaString();
					// c1.setModelo(marca);
					
					System.out.println("\nCarro inserido com sucesso!");
					isRunning = false;
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