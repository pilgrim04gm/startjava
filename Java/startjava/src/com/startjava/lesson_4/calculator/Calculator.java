package com.startjava.lesson_4.calculator;

import static java.lang.Math.*;

public class Calculator {

	private int[] numbers = new int[2];
	private char sign;
	private int result;

	public int[] getNumbers() {	return numbers; }

	void setNumbers(int number1, int number2) {
		numbers[0] = number1;
		numbers[1] = number2;
	}

	public char getSign() {
		return this.sign;
	}

	void setSign(char sign) {
		this.sign = sign;
	}

	int calculate() {
		int result = 1;
		switch (sign) {
			case '+':   
				result = addExact(numbers[0], numbers[1]);
				break;
			case '-':   
				result = subtractExact(numbers[0], numbers[1]);
				break;
			case '*':   
				result = multiplyExact(numbers[0], numbers[1]);
			    break;
			case '/':   
				result = numbers[0] / numbers[1];
				break;
			case '%':	
				result = numbers[0] % numbers[1];
			    break;
			case '^':
					result = (int) pow(numbers[0], numbers[1]);
				break;
		}
		return result;
	}
}