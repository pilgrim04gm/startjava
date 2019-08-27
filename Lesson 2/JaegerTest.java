public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Striker Eureka");
		System.out.println("Model name = " + jaegerOne.getModelName());
		jaegerOne.setMark("Mark-5");
		System.out.println("Mark = " + jaegerOne.getMark());
		jaegerOne.setOrigin("Australia");
		System.out.println("Origin = " + jaegerOne.getOrigin());
		jaegerOne.setHeight(250);
		System.out.println("Height = " + jaegerOne.getHeight());
		jaegerOne.setWeight (1850);
		System.out.println("Weight = " + jaegerOne.getWeight());
		jaegerOne.setSpeed(10);
		System.out.println("Speed = " + jaegerOne.getSpeed());
		jaegerOne.setStrength(10);
		System.out.println("Strength = " + jaegerOne.getStrength());
		jaegerOne.setArmor(9);
		System.out.println("Armor = " + jaegerOne.getArmor() + '\n');

		jaegerOne.drift();
		jaegerOne.move(5);
		jaegerOne.useVortexCannon();
		System.out.println(jaegerOne.scanKaiJu() + '\n');

		Jaeger jaegerSec = new Jaeger();
		jaegerSec.setModelName("Cherno Alpha");
		System.out.println("Model name = " + jaegerSec.getModelName());
		jaegerSec.setMark("Mark-1");
		System.out.println("Mark = " + jaegerSec.getMark());
		jaegerSec.setOrigin("Russia");
		System.out.println("Origin = " + jaegerSec.getOrigin());
		jaegerSec.setHeight(280);
		System.out.println("Height = " + jaegerSec.getHeight());
		jaegerSec.setWeight (2412);
		System.out.println("Weight = " + jaegerSec.getWeight());
		jaegerSec.setSpeed(3);
		System.out.println("Speed = " + jaegerSec.getSpeed());
		jaegerSec.setStrength(10);
		System.out.println("Strength = " + jaegerSec.getStrength());
		jaegerSec.setArmor(10);
		System.out.println("Armor = " + jaegerSec.getArmor());

		jaegerSec.drift();
		jaegerSec.move(10);
		jaegerSec.useVortexCannon();
		System.out.println(jaegerSec.scanKaiJu());
	}
}