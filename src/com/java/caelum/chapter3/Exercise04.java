package com.java.caelum.chapter3;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Factorial
		
		for(long i = 1, fat = 1; i <= 10; i++) {
			fat = fat * i;
			System.out.println(i + "! = " + fat);
		}
	}
}