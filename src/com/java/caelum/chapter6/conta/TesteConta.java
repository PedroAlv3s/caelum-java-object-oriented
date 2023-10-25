package com.java.caelum.chapter6.conta;

public class TesteConta {

	public static void main(String[] args) {
		
		// Dados do cliente
		Cliente pedro = new Cliente("674.093.564-12");
		pedro.setNome("Pedro");
		pedro.setSobrenome("Alves");
		pedro.setIdade(19);

		// Instância da classe conta (Novo objeto)
		ContaBancaria c1 = new ContaBancaria(300, pedro);
		
		c1.depositar(300);
		System.out.println(c1.mostrarSaldo());
		c1.sacar(150);
		System.out.println(c1.mostrarSaldo());
	}
}