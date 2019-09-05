import java.util.Scanner;

public class GuessNumber {
	public Player firstPlayer, secondPlayer;
	private int numberToGuess = (int) (100 * Math.random());
	private Scanner sc;

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void startGame() {
		do {
			compareNumbers(firstPlayer);
			if (firstPlayer.getNumber() != numberToGuess) {
				compareNumbers(secondPlayer);
			}
		} while((firstPlayer.getNumber() != numberToGuess) && (secondPlayer.getNumber() != numberToGuess));
	}

	public void compareNumbers(Player player) {
		System.out.print(player.getName() + ": ");
		scanNumber(player);
		if (player.getNumber() == numberToGuess) {
			System.out.println("Computer: Game over! " + player.getName() + " is the winner!");
		} else if (player.getNumber() > numberToGuess) {
			System.out.println("Computer: < ");
		} else System.out.println("Computer: > ");
	}

	public void scanNumber(Player player) {
		sc = new Scanner(System.in);
		player.setNumber(sc.nextInt());
	}
}