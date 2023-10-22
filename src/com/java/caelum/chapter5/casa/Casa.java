package com.java.caelum.chapter5.casa;

public class Casa {
	
	int contador = 0;
	String corCasa;
	int totalDePortas;
	Porta[] portas;
	Porta porta;
	
	void pintar(String cor) {
		this.corCasa = cor;
		System.out.println("A cor da casa é: " + this.corCasa);
	}
	
	void adicionarPorta(Porta porta) {
		if(portas[contador] == null) {
			portas[contador] = porta;
			contador++;
			System.out.println("Uma nova porta foi criada!");
		}
	}
	
	int contarPortasAbertas(Porta[] portas) {
		int contador = 0;
		
		for(int i = 0; i < portas.length; i++) {
			if(portas[i].abrir()) {
				contador++;
			}
		}
		return contador;
	}
	
	int contarPortasNaCasa() {
		int contador = 0;
		
		for(int i = 0; i < portas.length; i++) {
			if(portas[i] != null) {
				contador++;
			}
		}
		return contador;
	}
}