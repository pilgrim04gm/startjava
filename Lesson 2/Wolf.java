public class Wolf {
	
	private char gender;
	private String name;
	private double weight;
	private int age;
	private String color;

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("incorrect age");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {

	}

	public void sit() {

	}

	public void run() {

	}

	public void howl() {

	}

	public void hunt() {

	}
}