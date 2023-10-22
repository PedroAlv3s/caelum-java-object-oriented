package com.java.caelum.chapter3;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Fibonacci
		
		int limit = 10;
		long fibonacci = 0;
		long lastNumber = -1;
		long nextNumber = 1;
		
		for(int i = 0; i <= limit; i++) {
			fibonacci = lastNumber + nextNumber;
			lastNumber = nextNumber;
			nextNumber = fibonacci;
			
			if(i < limit) {
				System.out.print(fibonacci + ", ");
			} else {
				System.out.println(fibonacci + "...");
			}
		}
	}
}