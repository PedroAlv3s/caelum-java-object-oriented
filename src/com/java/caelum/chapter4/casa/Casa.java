package com.java.caelum.chapter4.casa;

public class Casa {
	
	String cor;
	Porta porta = new Porta();
	int contador;
	
	void pintar(String cor) {
		this.cor = cor;
		System.out.println("A porta foi pintada de " + this.cor + ".");
	}
	
	int quantasPortasEstaoAbertas() {
		int[] portas = new int[3];
		contador = 0;
		
		if(porta.aberta == true) {
			contador++;
			return portas[contador] = 1;
		} else {
			return 0;
		}
	}
}