package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumber {
	private Player firstPlayer, secondPlayer;
	private int numberToGuess = (int) (101 * Math.random());
	private Scanner sc = new Scanner(System.in);
	private int numberOfAttempts = 0;

	GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	void startGame() {
		numberOfAttempts++;
		if ((numberOfAttempts < 11) && makeMove(firstPlayer) && makeMove(secondPlayer)) {
			startGame();
		} else {
			if (numberOfAttempts == 11) {
				System.out.println( firstPlayer.getName() + " and " + secondPlayer.getName() +
				" have no attempts left.");
			}
			printInputNumbers(firstPlayer);
			printInputNumbers(secondPlayer);
		}
	}

	private boolean makeMove(Player player) {
		inputNumber(player);
		return !compareNumbers(player);
	}

	private void inputNumber(Player player) {
		System.out.print(player.getName() + ": ");
		player.setNumber(sc.nextInt(), numberOfAttempts-1);
	}

	private boolean compareNumbers(Player player) {
		if (player.getNumber(numberOfAttempts-1) == numberToGuess) {
			System.out.println("Computer: Game over! " + " Player " + player.getName() + " has guessed the number "
					+ player.getNumber(numberOfAttempts-1) + " in " + numberOfAttempts +" attempts!");
			return true;
		} else if (player.getNumber(numberOfAttempts-1) > numberToGuess) {
			System.out.println("Computer: < ");
		} else { 
			System.out.println("Computer: > ");
		}
		return false;
	}

	private void printInputNumbers(Player player) {
		int i =0;
		String space;
		System.out.print(player.getName() + ": ");
		while(i < 10 && player.getNumber(i) != 0) {
			if (player.getNumber(i) < 10) {
				space = " " + player.getNumber(i);
			} else space = Integer.toString(player.getNumber(i));
			System.out.print(space + " ");
			i++;
		}
		System.out.println();
	}
}