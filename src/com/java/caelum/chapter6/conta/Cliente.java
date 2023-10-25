package com.java.caelum.chapter6.conta;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	Cliente(String cpf) {
		this.cpf = cpf;
	}

	public String mostrarNome() {
		return this.nome + " " + this.sobrenome + " - " + this.cpf;
	}

	public void mudarCPF(String cpf) {
		if(idade > 60) {
			validarCPF(cpf);
		}
		this.cpf = cpf;
	}

	public boolean validarCPF(String cpf) {
		if(cpf.length() < 11) {
			return false;
		} else {
			return true;
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}