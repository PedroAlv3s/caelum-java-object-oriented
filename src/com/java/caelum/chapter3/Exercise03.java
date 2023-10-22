package com.java.caelum.chapter3;

public class Exercise03 {

	public static void main(String[] args) {
		
		// Sum of the numbers of 1 to 1000
		
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		
		System.out.println("Result: " + sum);
	}
}