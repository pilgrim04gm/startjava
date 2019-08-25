public class WolfTest{
	public static void main(String[] args) {
		Wolf firstWolf = new Wolf();
		firstWolf.setGender('m');
		firstWolf.setName("Sharik");
		firstWolf.setWeight(20);
		firstWolf.setAge(3);
		firstWolf.setColor("grey");

		System.out.println(firstWolf.getGender());
		System.out.println(firstWolf.getName());
		System.out.println(firstWolf.getWeight());
		System.out.println(firstWolf.getAge());
		System.out.println(firstWolf.getColor());

		firstWolf.go();
		firstWolf.sit();
		firstWolf.run();
		firstWolf.howl();
		firstWolf.hunt();
	}
}