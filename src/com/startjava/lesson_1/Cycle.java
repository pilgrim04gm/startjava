package com.startjava.lesson_1;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i < 21; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int counter = 6;
		while (counter >= -6) {
			System.out.print(counter + " ");
			counter -= 2;
		}
		System.out.println();

		counter = 10;
		int summOdd = 0;
		do {
			if (counter % 2 == 1) {
				summOdd += counter;
			} 
			counter++;
		} while (counter <= 20);
		System.out.println(summOdd);
	}
}