package com.java.caelum.chapter5.casa;

public class TesteCasa {
	
	public static void main(String[] args) {
		
		Casa casa = new Casa();
		casa.portas = new Porta[5];
		
		Porta porta1 = new Porta();
	
		casa.adicionarPorta(porta1);
		
		Porta porta2 = new Porta();
	
		casa.adicionarPorta(porta2);
	
		Porta porta3 = new Porta();
		porta3.abrir();
		casa.adicionarPorta(porta3);
		
		System.out.println("Portas na casa: " + casa.contarPortasNaCasa());
		System.out.println("Portas abertas na casa: " + casa.contarPortasAbertas(casa.portas));
	}
}