package com.java.caelum.chapter4.banco;

public class Funcionario {
	
	String nome;
	String departamento;
	double salario;
	String registroGeral;
	Data data = new Data();
	boolean estarNoBanco;
	
	void demitir() {
		this.estarNoBanco = false;
	}
	
	double bonificar(double aumento) {
		double novoSalario = this.salario + aumento;
		this.salario = novoSalario;
		
		return this.salario;
	}
	
	String mostrarDados() {
		String dados = "Nome : " + this.nome
					+ "\nDepartamento: " + this.departamento
					+ "\nSalário: " + this.salario
					+ "\nTrabalha nesta agência? " + this.confirmarEmprego()
					+ "\nData de entrada: " + this.data.mostrarData();
		
		return dados;
	}
	
	String confirmarEmprego() {
		if(estarNoBanco) {
			return "Sim.";
		} else {
			return "Não.";
		}
	}
}