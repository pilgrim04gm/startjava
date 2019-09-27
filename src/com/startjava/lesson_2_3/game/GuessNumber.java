package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
	public Player firstPlayer, secondPlayer;
	private int numberToGuess = (int) (101 * Math.random());
	private Scanner sc = new Scanner(System.in);

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void startGame() {
		if (!makeMove(firstPlayer) && !makeMove(secondPlayer)) {
			startGame();
		} 
	}

	private boolean makeMove(Player player) {
		inputNumber(player);
		return compareNumbers(player);
	}

	private void inputNumber(Player player) {
		System.out.print(player.getName() + ": ");
		player.setNumber(sc.nextInt());
	}

	private boolean compareNumbers(Player player) {
		if (player.getNumber() == numberToGuess) {
			System.out.println("Computer: Game over! " + player.getName() + " is the winner!");
			return true;
		} else if (player.getNumber() > numberToGuess) { 
			System.out.println("Computer: < ");
		} else { 
			System.out.println("Computer: > ");
		}
		return false;
			
	}
}