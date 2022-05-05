public class RenavamException extends Exception {

	public void RenInvalido(String dado) {
		if (dado.length() < 10) {
			System.out.println("O número inserido é inválido.");
		}
	}
}