package com.java.caelum.chapter6.conta;

public class ContaBancaria {
	
	private static int totalContas;
	private double limite;
	private double saldo;
	Cliente cliente;
	
	// Contrutores
	ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		ContaBancaria.totalContas += 1;
	}
	
	public ContaBancaria(double limite, Cliente cliente) {
		this(cliente);
		this.limite = limite;
		System.out.println("Uma nova conta foi criada!");
	}

	public void sacar(double valor) {
		if((valor > (saldo + limite))) {
			System.out.println("Não foi possível fazer o saque, o valor ultrapassa o limite!");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("Não é possível depositar um valor negativo!");
		} else {
			this.saldo = saldo + valor;
		}
	}
	
	public boolean transferirPara(ContaBancaria contaDestino, double valor) {
		if(valor > saldo) {
			return false;
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);;
			return true;
		}
	}
	
	public double mostrarSaldo() {
		return getSaldo();
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public static int getTotalContas() {
		return ContaBancaria.totalContas;
	}
}