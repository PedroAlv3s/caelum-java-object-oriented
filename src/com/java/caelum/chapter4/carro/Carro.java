package com.java.caelum.chapter4.carro;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	boolean temGasolina;
	boolean ligado;
	Motorista motorista = new Motorista();

	boolean ligar() {
		return this.ligado = true;
	}

	boolean deligar() {
		return this.ligado = false;
	}

	void acelerar(double quantidade) {
		velocidadeAtual += quantidade;
	}

	String mostrarVelocidade() {
		String msg = "O carro está a " + this.velocidadeAtual + " Km por hora!";
		return msg;
	}

	int pegaMacha() {
		if (this.velocidadeAtual <= 0) {
			return 0;
		} else if ((this.velocidadeAtual > 0) && (this.velocidadeAtual <= 20)) {
			return 1;
		} else if ((this.velocidadeAtual > 20) && (this.velocidadeAtual <= 40)) {
			return 2;
		} else if ((this.velocidadeAtual > 40) && (this.velocidadeAtual <= 70)) {
			return 3;
		} else if ((this.velocidadeAtual > 70) && (this.velocidadeAtual <= 100)) {
			return 4;
		} else {
			return 5;
		}
	}
}