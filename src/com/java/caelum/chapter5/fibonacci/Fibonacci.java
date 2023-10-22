package com.java.caelum.chapter5.fibonacci;

public class Fibonacci {
	
	static int contador; 
	
	static int calcFibonacci(int value) {
		contador++;
		int[] fib = new int[value];
		
		if(fib.length == 0 || fib.length == 1) {
			return value;
		}
		
		return calcFibonacci(fib.length - 1) + calcFibonacci(fib.length - 2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.calcFibonacci(9));
		System.out.println("Chamadas: " + contador);
	}
}