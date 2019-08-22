public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 4;
		char sign = '^';
		int secondNumber = 3;
		int result;
		
		if (sign == '+') {
			result = firstNumber + secondNumber;
		} else if (sign == '-') {
			result = firstNumber - secondNumber;
		} else if (sign == '*') {
			result = firstNumber * secondNumber;
		} else if (sign == '/') {
			result = firstNumber / secondNumber;
		} else if (sign == '^') {
			result = 1;
			for (int i = 1; i <= secondNumber; i++) {
				result *= firstNumber;
			}
		} else {
			result = firstNumber % secondNumber;
		} 
		System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
	}
}