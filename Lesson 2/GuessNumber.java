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
		do {
		} while (!compareNumbers(firstPlayer)&&!compareNumbers(secondPlayer));
	}

	public boolean compareNumbers(Player player) {
		System.out.print(player.getName() + ": ");
		inputNumber(player);
		if (player.getNumber() == numberToGuess) {
			System.out.println("Computer: Game over! " + player.getName() + " is the winner!");
			return true;
		} else {
			if (player.getNumber() > numberToGuess) {
				System.out.println("Computer: < ");
			} else {
				System.out.println("Computer: > ");
			}
			return false;
		}
	}

	public void inputNumber(Player player) {
		player.setNumber(sc.nextInt());
	}
}