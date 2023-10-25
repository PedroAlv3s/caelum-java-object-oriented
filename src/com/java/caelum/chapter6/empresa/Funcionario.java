package com.java.caelum.chapter6.empresa;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cpf;
	private int id;

	Funcionario() {}

	Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(int id, String cpf, double salario) {
		this.id = id + 1;
		this.cpf = cpf;
		this.salario = salario;
		System.out.println("Um novo funcionário foi contratado!");
	}

	public double bonificar(double valor) {
		return this.salario += valor;
	}
	
	public void demitir() {
		System.out.println("O funcionário " + this.nome + " está demitido!");
	}

	public boolean validarCPF(String cpf) {
		if(cpf.length() < 11) {
			return false;
		} else {
			return true;
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public String getNome() {
		return this.nome;
	}

	public int getId() {
		return this.id;
	}
}