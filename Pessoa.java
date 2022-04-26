public class Pessoa{

	private int cpf;
	private String nome;

//=============================================
// THROWS (com "s") ==> Aviso: "POSSO lancar um objeto"
// THROW  (sem "s") ==> Ordem: "Lance o objeto"


	public void setCpf(int cpf) throws CpfNegException{
		if(cpf >=0){
			this.cpf = cpf;
		}
		else{
			throw new CpfNegException();
		}
	}

//=============================================
	public void setNome(String nome) throws NameSizeException{
		if(nome.length() <= 30){
			this.nome = nome;
		}
		else{
			throw new NameSizeException();
		}
	}



	public Pessoa(){
		cpf = 0;
		nome = "";
	}

	public int getCpf(){
		return cpf;
	}
		
	public String getNome(){
		return nome;		
	}


}