import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			Calculator calc = new Calculator();
			System.out.print("Enter first number: ");
			calc.setFirstNumber(scan.nextInt());
			System.out.print("Enter sign of operation: ");
			calc.setSign(scan.next().charAt(0));
			System.out.print("Enter second number: ");
			calc.setSecondNumber(scan.nextInt());
			System.out.println(calc.getFirstNumber() + " " + calc.getSign() + " " + calc.getSecondNumber() + " = " + calc.calculate(calc.getFirstNumber(), calc.getSecondNumber(), calc.getSign()));
			System.out.print("Do you want to continue? [yes/no]:");
			String answer = scan.next();
			switch (answer) {
				case "yes": case "Yes": case "Y": case "y":
							break;
				default:	flag = false;
							break; 

			}
		} while(flag);
	}
}