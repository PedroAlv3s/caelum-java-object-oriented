package com.java.caelum.chapter3;

public class Exercise06 {

	public static void main(String[] args) {

		int x = 13;
		int y;

		if (x % 2 == 0) {
			y = (x / 2);
		} else {
			y = (3 * x) + 1;
		}

		for (; y != 1;) {
			if (x % 2 == 0) {
				y = (x / 2);
			} else {
				y = (3 * x) + 1;
			}

			x = y;

			if (y != 1) {
				System.out.print(y + " -> ");
			} else {
				System.out.println(y);
			}
		}
	}
}