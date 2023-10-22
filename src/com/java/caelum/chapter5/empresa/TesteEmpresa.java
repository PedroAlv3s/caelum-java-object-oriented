package com.java.caelum.chapter5.empresa;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.funcionarios = new Funcionario[10];
		empresa.funcionariosNovos = new Funcionario[20];
		
		Funcionario func1 = new Funcionario();
		Funcionario func2= new Funcionario();
		Funcionario func3 = new Funcionario();
		Funcionario func4= new Funcionario();
		Funcionario func5 = new Funcionario();
		Funcionario func6= new Funcionario();
		Funcionario func7 = new Funcionario();
		Funcionario func8= new Funcionario();
		Funcionario func9= new Funcionario();
		Funcionario func10 = new Funcionario();
		Funcionario func11 = new Funcionario();
		Funcionario func12= new Funcionario();
		Funcionario func13= new Funcionario();
		Funcionario func14 = new Funcionario();
		
		empresa.adicionar(func1);
		empresa.adicionar(func2);
		empresa.adicionar(func3);
		empresa.adicionar(func4);
		empresa.adicionar(func5);
		empresa.adicionar(func6);
		empresa.adicionar(func7);
		empresa.adicionar(func8);
		empresa.adicionar(func9);
		empresa.adicionar(func10);
		empresa.adicionar(func11);
		empresa.adicionar(func12);
		empresa.adicionar(func13);
		empresa.adicionar(func14);
	}
}