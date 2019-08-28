public class JaegerTest {
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger();
		strikerEureka.setModelName("Striker Eureka");
		System.out.println("Model name = " + strikerEureka.getModelName());
		strikerEureka.setMark("Mark-5");
		System.out.println("Mark = " + strikerEureka.getMark());
		strikerEureka.setOrigin("Australia");
		System.out.println("Origin = " + strikerEureka.getOrigin());
		strikerEureka.setHeight(250);
		System.out.println("Height = " + strikerEureka.getHeight());
		strikerEureka.setWeight(1850);
		System.out.println("Weight = " + strikerEureka.getWeight());
		strikerEureka.setSpeed(10);
		System.out.println("Speed = " + strikerEureka.getSpeed());
		strikerEureka.setStrength(10);
		System.out.println("Strength = " + strikerEureka.getStrength());
		strikerEureka.setArmor(9);
		System.out.println("Armor = " + strikerEureka.getArmor() + '\n');

		strikerEureka.drift();
		strikerEureka.move(5);
		strikerEureka.useVortexCannon();
		System.out.println(strikerEureka.scanKaiJu() + '\n');

		Jaeger chernoAlpha = new Jaeger();
		chernoAlpha.setModelName("Cherno Alpha");
		System.out.println("Model name = " + chernoAlpha.getModelName());
		chernoAlpha.setMark("Mark-1");
		System.out.println("Mark = " + chernoAlpha.getMark());
		chernoAlpha.setOrigin("Russia");
		System.out.println("Origin = " + chernoAlpha.getOrigin());
		chernoAlpha.setHeight(280);
		System.out.println("Height = " + chernoAlpha.getHeight());
		chernoAlpha.setWeight(2412);
		System.out.println("Weight = " + chernoAlpha.getWeight());
		chernoAlpha.setSpeed(3);
		System.out.println("Speed = " + chernoAlpha.getSpeed());
		chernoAlpha.setStrength(10);
		System.out.println("Strength = " + chernoAlpha.getStrength());
		chernoAlpha.setArmor(10);
		System.out.println("Armor = " + chernoAlpha.getArmor());

		chernoAlpha.drift();
		chernoAlpha.move(10);
		chernoAlpha.useVortexCannon();
		System.out.println(chernoAlpha.scanKaiJu());
	}
}