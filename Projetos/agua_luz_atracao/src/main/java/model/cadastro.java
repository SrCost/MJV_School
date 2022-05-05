package model;

public class cadastro {
	
	private String nome;
	private String cpf;
	private String rg;
	private endereco endereco;
	private pais pais;
	private String celular;
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public pais getPais() {
		return pais;
	}
	public void setPais(pais pais) {
		this.pais = pais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", pais=" + pais
				+ ", celular=" + celular + "]";
	}
	
}
