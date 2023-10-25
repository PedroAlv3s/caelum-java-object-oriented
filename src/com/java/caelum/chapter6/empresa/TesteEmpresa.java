package com.java.caelum.chapter6.empresa;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.funcionarios = new Funcionario[10];
		empresa.funcionariosNovos = new Funcionario[20];

		Funcionario func1 = new Funcionario(0, "234.876.109-87", 3000);
		empresa.adicionar(func1);

		System.out.println(func1.getId());
	}
}