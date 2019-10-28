package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("You have 10 attempts:");
			System.out.print("Enter name of the first player: ");
			Player firstPlayer = new Player(sc.nextLine());
			System.out.print("Enter name of the second player: ");
			Player secondPlayer = new Player(sc.nextLine());
			GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
			guessNumber.startGame();

			do {
				System.out.print("Do you want to continue? [yes/no]: ");
				answer = sc.nextLine();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}