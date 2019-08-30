import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the first player: ");
		Player firstPlayer = new Player(sc.nextLine());
		System.out.print("Enter name of the second player: ");
		Player secondPlayer = new Player(sc.nextLine());
		GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
		guessNumber.game();
	}
}