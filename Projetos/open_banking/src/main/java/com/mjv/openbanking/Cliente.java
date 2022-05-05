package com.mjv.openbanking;

public class Cliente {
	
	private String nome;
	private String cpf;
	private char sexo;
	private int idade;
	private endereco endereco;
	
	public Cliente() {
	}

	public Cliente(String nome, String cpf, char sexo, int idade, endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = endereco;
	}

	
	
	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente:"
				+ " \nNome:................ " + nome 
				+ " \nCPF:................. " + cpf 
				+ " \nSexo:................ " + sexo 
				+ " \nIdade:............... " + idade;
	}
	
	
	
	
	
}
