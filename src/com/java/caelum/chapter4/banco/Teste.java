package com.java.caelum.chapter4.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.nome = "Fábio Rogério";
		func1.departamento = "Sei lá man";
		func1.estarNoBanco = true;
		func1.data.dia = 2;
		func1.data.mes = 9;
		func1.data.ano = 2028;
		func1.registroGeral = "9087-890";
		func1.salario = 4500;
		
		func1.bonificar(500);
		
		System.out.println(func1.mostrarDados());
		System.out.println();
		
		Funcionario func2 = new Funcionario();
		
		func2.nome = "Fábio Rogério";
		func2.departamento = "Sei lá man";
		func2.estarNoBanco = true;
		func2.registroGeral = "9087-890";
		func2.salario = 4500;
		
		if(func1 == func2) {
			System.out.println("Somos iguais!");
		} else {
			System.out.println("Somos diferentes!");
		}
		System.out.println();
		
		Funcionario func3 = func2;
		
		if(func2 == func3) {
			System.out.println("Eita! Somos iguais!");
		} else {
			System.out.println("Poxa! Não somos iguais!");
		}
	}
}