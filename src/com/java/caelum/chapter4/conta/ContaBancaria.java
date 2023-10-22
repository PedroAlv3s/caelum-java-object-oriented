package com.java.caelum.chapter4.conta;

public class ContaBancaria {
	
	double limite;
	double saldo;
	int numero;
	Cliente cliente = new Cliente();
	
	boolean sacar(double valor) {
		if((valor > limite) && (valor > saldo)) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	
	boolean transferePara(ContaBancaria contaDestino, double valor) {
		if(valor > saldo) {
			return false;
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);;
			return true;
		}
	}
	
	double mostrarSaldo() {
		return this.saldo;
	}
}