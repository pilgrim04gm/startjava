public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 4;
		char signOfOperation = '^';
		int secondNumber = 3;

		int resultOfOperation;
		if (signOfOperation == '+') {
			resultOfOperation = firstNumber + secondNumber;
		} else if (signOfOperation == '-') {
			resultOfOperation = firstNumber - secondNumber;
		} else if (signOfOperation == '*') {
			resultOfOperation = firstNumber * secondNumber;
		} else if (signOfOperation == '/') {
			resultOfOperation = firstNumber / secondNumber;
		} else if (signOfOperation == '^') {
			resultOfOperation = 1;
			for (int i = 1; i <= secondNumber; i++) {
				resultOfOperation *= firstNumber;
			}
		} else {
			resultOfOperation = firstNumber % secondNumber;
		} 
		System.out.println(firstNumber + " " + signOfOperation + " " + secondNumber + " = " + resultOfOperation);
	}
}