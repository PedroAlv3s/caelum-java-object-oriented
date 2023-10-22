package com.java.caelum.chapter4.carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.motorista.nome = "Pedro";
		carro.motorista.sobrenome = "Alves";
		
		carro.velocidadeAtual = 0;
		
		carro.cor = "Prata";
		carro.modelo = "Não entendo!";
		carro.temGasolina = true;
		carro.velocidadeMaxima = 240;
		
		carro.ligar();
		carro.acelerar(60);
		System.out.println(carro.mostrarVelocidade());
		
		System.out.println("Macha do carro: " + carro.pegaMacha());
	}
}