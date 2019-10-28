package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int[] number = new int[10];

	Player(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int getNumber(int i) {
		return number[i];
	}

	void setNumber(int number, int i) {
		this.number[i] = number;
	}
}