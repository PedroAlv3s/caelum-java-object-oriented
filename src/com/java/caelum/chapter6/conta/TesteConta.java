package com.java.caelum.chapter6.conta;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.saldo = 100;
		c1.limite = 200;

		double novoSaldo = 200;

		if(novoSaldo < c1.limite) {
			System.out.println("O saldo não pode ser mudado! Tente novamente!");
		} else {
			c1.saldo = novoSaldo;
		}

		System.out.println("Saldo: " + c1.saldo);
	}
}