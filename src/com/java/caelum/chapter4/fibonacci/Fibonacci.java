package com.java.caelum.chapter4.fibonacci;

public class Fibonacci {
	
	static long contador;
	
	int calcularFibonacci(int valor) {
		contador++;
		if((valor == 0) || (valor == 1)) {
			return valor;
		}
		
		return calcularFibonacci(valor - 1) + calcularFibonacci(valor - 2);
	}
	
	int calcularFibonacciTernario(int valor) {
		int result = (valor == 0 || valor == 1) ? valor : (calcularFibonacci(valor - 1) + calcularFibonacci(valor - 2));
		return result;
	}
	
	public static void main(String[] args) {
		contador = 0;
		System.out.println("A quantidade é: " + new Fibonacci().calcularFibonacci(9));
		System.out.println("Quatidade de chamadas: " + contador);
		
		System.out.println();
		System.out.println("Fibonacci ternário: " + new Fibonacci().calcularFibonacciTernario(9));
	}
}