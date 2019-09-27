package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 250, 1850, 10, 10, 9);
		System.out.println("Model name = " + strikerEureka.getModelName());
		System.out.println("Mark = " + strikerEureka.getMark());
		System.out.println("Origin = " + strikerEureka.getOrigin());
		System.out.println("Height = " + strikerEureka.getHeight());
		System.out.println("Weight = " + strikerEureka.getWeight());
		System.out.println("Speed = " + strikerEureka.getSpeed());
		System.out.println("Strength = " + strikerEureka.getStrength());
		System.out.println("Armor = " + strikerEureka.getArmor() + '\n');

		strikerEureka.drift();
		strikerEureka.move(5);
		strikerEureka.useVortexCannon();
		System.out.println(strikerEureka.scanKaiJu() + '\n');

		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 280, 2412, 3, 10, 10);
		System.out.println("Model name = " + chernoAlpha.getModelName());
		System.out.println("Mark = " + chernoAlpha.getMark());
		System.out.println("Origin = " + chernoAlpha.getOrigin());
		System.out.println("Height = " + chernoAlpha.getHeight());
		System.out.println("Weight = " + chernoAlpha.getWeight());
		System.out.println("Speed = " + chernoAlpha.getSpeed());
		System.out.println("Strength = " + chernoAlpha.getStrength());
		System.out.println("Armor = " + chernoAlpha.getArmor() + '\n');

		chernoAlpha.drift();
		chernoAlpha.move(10);
		chernoAlpha.useVortexCannon();
		System.out.println(chernoAlpha.scanKaiJu());
	}
}