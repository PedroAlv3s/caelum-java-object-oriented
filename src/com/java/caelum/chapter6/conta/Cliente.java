package com.java.caelum.chapter6.conta;

public class Cliente {
	
	String nome;
	String sobrenome;
	String cpf;
	
	String mostrarNome() {
		return this.nome + " " + this.sobrenome + " - " + this.cpf;
	}
}