package com.java.caelum.chapter4.casa;

public class Porta {
	
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abrir() {
		System.out.println("Porta aberta!");
	}
	
	void fechar() {
		System.out.println("Porta fechada!");
	}
	
	void pintar(String cor) {
		this.cor = cor;
		System.out.println("A porta foi pintada de " + this.cor);
	}
	
	boolean estaAberta() {
		boolean resultado = (aberta == true) ? true : false;
		return resultado;
	}
}