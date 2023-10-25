package com.java.caelum.chapter6.empresa;

public class Empresa {

	int contador = 0;
	int novoContador = 0;
	Funcionario[] funcionarios;
	Funcionario[] funcionariosNovos;
	String cnpj;
	String nome;

	public void adicionar(Funcionario funcionario) {
		if(verificarArray()) {
			clonarFuncionarios(funcionariosNovos);
			if(funcionariosNovos[novoContador] == null) {
				funcionariosNovos[novoContador] = funcionario;
				System.out.println("Funcionário contratado!");
			} else {
				System.out.println("Funcionário não contratado!");
			}
		} else {
			if (funcionarios[contador] == null) {
				funcionarios[contador] = funcionario;
				System.out.println("Funcionário contratado!");
				contador++;
			} else {
				System.out.println("Funcionário não contratado!");
			}
		}
	}
	
	public boolean verificarArray() {
		boolean fechar = false;
		
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				novoContador++;
				
				if(novoContador > funcionarios.length) {
					fechar = true;
					break;
				}
			}
		}
		return fechar;
	}
	
	public void clonarFuncionarios(Funcionario[] listaFuncionarios) {
		for(int i = 0; i < funcionarios.length; i++) {
			listaFuncionarios[i] = funcionarios[i];
		}
	}
	
	public void mostrarFuncionarios() {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				System.out.println("Funcionário " + (i+1) + ": " + this.funcionarios[i].getNome()
									+ " | Salário: " + this.funcionarios[i].getSalario());
			} else {
				System.out.println("Vaga disponível!");
			}
		}
	}
	
	public boolean mostrarContratado(Funcionario funcionario) {
		boolean retorno= false;
		
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] == funcionario) {
				retorno = true;
			}
		}
		return retorno;
	}
}