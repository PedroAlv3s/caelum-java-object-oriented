package com.java.caelum.chapter3;

public class Exercise08 {

	public static void main(String[] args) {
		
		int fibonacci = 0;
		int nextNumber = 1;
		
		for(int i = 0, lastNumber = -1; i <= 10; i++) {
			fibonacci = lastNumber + nextNumber;
			lastNumber = nextNumber;
			nextNumber = fibonacci;
			
			if(i < 10) {
				System.out.print(fibonacci + ", ");
			} else {
				System.out.print(fibonacci + "...");
			}
		}
	}
}