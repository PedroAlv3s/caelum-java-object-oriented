package com.java.caelum.chapter5.conta;

public class Conta {
	
	String nome;
	double saldo;
	
	double sacar(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}
	
	double depositar(double valor) {
		this.saldo += valor;
		return this.saldo;
	}
	
	void transferir(Conta contaDestino, double valor) {
		this.saldo -= valor;
		contaDestino.saldo += valor;
	}
}