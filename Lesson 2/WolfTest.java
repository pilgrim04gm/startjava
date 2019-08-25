public class WolfTest{
	public static void main(String[] args) {
		Wolf firstWolf = new Wolf();
		firstWolf.gender = 'm';
		firstWolf.name = "Sharik";
		firstWolf.weight = 20;
		firstWolf.age = 3;
		firstWolf.color = "grey";

		System.out.println(firstWolf.gender);
		System.out.println(firstWolf.name);
		System.out.println(firstWolf.weight);
		System.out.println(firstWolf.age);
		System.out.println(firstWolf.color);

		firstWolf.go();
		firstWolf.sit();
		firstWolf.run();
		firstWolf.howl();
		firstWolf.hunt();
	}
}