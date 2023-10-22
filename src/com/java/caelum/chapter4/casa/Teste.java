package com.java.caelum.chapter4.casa;

public class Teste {
	
	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.porta.aberta = true;
		casa.porta.cor = "Branca";
		casa.porta.dimensaoX = 150;
		casa.porta.dimensaoY = 600;
		casa.porta.dimensaoZ = 5;
		
		casa.porta.abrir();
		System.out.println(casa.porta.estaAberta());
		
		casa.porta.pintar(casa.porta.cor);
		
		Porta porta1 = new Porta();
		casa.porta = porta1;
		porta1.aberta = true;
		
		System.out.println("Portas abertas: " + casa.quantasPortasEstaoAbertas());
	}
}