package com.startjava.lesson_1.calculator;

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

	public int calculate() {
		int result = 1;
		switch (sign) {
			case '+':   result = this.firstNumber + this.secondNumber;
					    break;
			case '-':   result = this.firstNumber - this.secondNumber;
					    break;
			case '*':   result = this.firstNumber * this.secondNumber;
			            break;
			case '/':   result = this.firstNumber / this.secondNumber;
					    break;
			case '%':	result = this.firstNumber % this.secondNumber;
			        	break;
			case '^': {
						for (int i = 1; i <= this.secondNumber; i++) {
							result *= this.firstNumber;
						}
						break;
			}

		}
		return result;
	}
}