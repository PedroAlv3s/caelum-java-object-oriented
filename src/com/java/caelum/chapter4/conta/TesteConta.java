package com.java.caelum.chapter4.conta;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.saldo = 1000;
		c1.transferePara(c2, 500);
	}
}