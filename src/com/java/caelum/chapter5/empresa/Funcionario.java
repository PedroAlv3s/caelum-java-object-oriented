package com.java.caelum.chapter5.empresa;

public class Funcionario {
	
	String nome;
	double salario;
	String cpf;
	
	double bonificar(double valor) {
		return this.salario += valor;
	}
	
	void demitir() {
		System.out.println("O funcionário " + this.nome + " está demitido!");
	}
}