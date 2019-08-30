import java.util.Scanner;

public class GuessNumber {
	Player firstPlayer, secondPlayer;
	int numberGuess;
	int numberToGuess = (int) (100 * Math.random());

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void game () {
		int numberOfPlayer = 1;
		do {
			if (numberOfPlayer == 1) {
				checkGuess(firstPlayer);
				numberOfPlayer = 2;
			} else {
				checkGuess(secondPlayer);
				numberOfPlayer = 1;
			}
		} while(numberGuess != numberToGuess);
	}

	public void checkGuess(Player player) {
		System.out.print(player.getName() + ": ");
		Scanner sc = new Scanner(System.in);
		player.setNumber(sc.nextInt());
		numberGuess = player.getNumber();
		if (numberGuess == numberToGuess) {
			System.out.println("Computer: Game over! " + player.getName() + " is the winner!");
		} else if (numberGuess > numberToGuess) {
			System.out.println("Computer: < ");
		} else System.out.println("Computer: > ");
	}
}