public class TstPes{

    public static void main(String arg[]){
	
	Pessoa p1 = new Pessoa();
	Leitura l = new Leitura();

	boolean vai = true;

	while(vai){
		try{
			p1.setCpf(Integer.parseInt(l.entDados("\nCPF: ")));
			vai = false;
		}
	
		catch(CpfNegException cne){
			cne.impCpfNeg();
		}
	
		catch(NumberFormatException nfe){
			System.out.println("\nO valor do CPF deve ser um int");
		}

		System.out.println("\nCPF: "+p1.getCpf());

	} //fim do while


   }

}