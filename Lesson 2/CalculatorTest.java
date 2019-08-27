import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			Calculator calc = new Calculator();
			System.out.print("Enter first number: ");
			calc.setFirstNumber(scan.nextInt());
			System.out.print("Enter sign of operation: ");
			calc.setSign(scan.next().charAt(0));
			System.out.print("Enter second number: ");
			calc.setSecondNumber(scan.nextInt());
			System.out.println(calc.getFirstNumber() + " " + calc.getSign() + " " + calc.getSecondNumber() + " = " + calc.calculate());

			do {
				System.out.print("Do you want to continue? [yes/no]: ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));

		} while(answer.equals("yes"));
	}
}