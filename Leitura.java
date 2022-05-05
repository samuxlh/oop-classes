//Samuel Cezar dos Santos | 1996789
//Prog. Orientada Objetos - ADS

import java.util.Scanner;

public class Leitura {

	public String entradaString() {
		String resp = "";
		Scanner scan = new Scanner(System.in);
		resp = scan.nextLine();
		return resp;
	}

	public int entradaInt() {
		String resp = "";
		Scanner scan = new Scanner(System.in);
		resp = scan.nextLine();
		int respInt = Integer.parseInt(resp);
		return respInt;
	}

	public double entradaDouble() {
		String resp = "";
		Scanner scan = new Scanner(System.in);
		resp = scan.nextLine();
		double respDouble = Double.parseDouble(resp);
		return respDouble;
	}
}