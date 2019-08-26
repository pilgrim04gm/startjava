public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char sign;
	private int result;

	public int getFirstNumber() {
		return this.firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return this.secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getSign() {
		return this.sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate(int firstNumber, int secondNumber, char sign) {
		int result = 1;
		switch (sign) {
			case '+':   result = firstNumber + secondNumber;
					    break;
			case '-':   result = firstNumber - secondNumber;
					    break;
			case '*':   result = firstNumber * secondNumber;
			            break;
			case '/':   result = firstNumber / secondNumber;
					    break;
			case '%':	result = firstNumber % secondNumber;
			        	break;
			case '^': {
						for (int i = 1; i <= secondNumber; i++) {
							result *= firstNumber;
						}
						break;
			}

		}
		return result;
	}
}