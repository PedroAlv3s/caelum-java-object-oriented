package com.java.caelum.chapter3;

public class Exercise07 {

	public static void main(String[] args) {
		
		int limit = 5;
		
		for(int i = 1; i <= limit; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}
}