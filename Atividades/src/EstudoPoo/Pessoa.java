package EstudoPoo;

public class Pessoa {
	String nome;
	String CPF;
	String Endereco;
	
	//carinha
	Pessoa ( String CPF, String nome, String Endereco ){
		this.CPF = CPF;
		this.nome = nome;
		this.Endereco = Endereco;
	}
	
	Pessoa ( String CPF, String nome ){
		this(CPF, nome, "Não informado");
	}
	
}
