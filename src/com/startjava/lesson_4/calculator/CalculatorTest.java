package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer, str;
		do {
			Calculator calc = new Calculator();
			System.out.print("Enter mathematical expression: ");
			str = scan.nextLine();
			calc.setNumbers(Integer.parseInt(str.split(" ")[0]), Integer.parseInt(str.split(" ")[2]));
			calc.setSign(str.split(" ",3)[1].charAt(0));
			System.out.println(str + " = " + calc.calculate());

			do {
				System.out.print("Do you want to continue? [yes/no]: ");
				answer = scan.nextLine();
			} while(!answer.equals("yes") && !answer.equals("no"));

		} while(answer.equals("yes"));
	}
}