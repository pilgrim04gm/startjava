package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int numberToGuess = 89; // The number computer made up.
		int numberPick = 50;
		int boundBottom = 0;
		int boundTop = 100;

		while (numberPick != numberToGuess) {
			if (numberPick < numberToGuess) {
				System.out.println("Then number entered is less than the number computer made up.");
				boundBottom = numberPick;
				numberPick = (boundBottom + boundTop) / 2;
			} else {
				System.out.println("Then number entered is more than the number computer made up.");
				boundTop = numberPick;
				numberPick = (boundBottom + boundTop) / 2;
			}
		}
		System.out.println(numberPick);		
	}
}