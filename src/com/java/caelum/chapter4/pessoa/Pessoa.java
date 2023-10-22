package com.java.caelum.chapter4.pessoa;

public class Pessoa {
	
	String nome;
	int idade;
	
	void fazAniversario() {
		System.out.println("Parabéns " + this.nome + ". Hoje é seu aniversário!");
		System.out.println("Feliz " + (this.idade + 1) + " anos de vida!");
	}
}