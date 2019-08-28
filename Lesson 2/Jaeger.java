public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private double height;
	private double weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, double height, double weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return this.armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println("You are in a drift mode");
		return true;
	}

	public void move(int n) {
		System.out.println("You have passed " + n + " steps");
	}

	public String scanKaiJu() {
		return "nothing";
	}

	public void useVortexCannon() {
		System.out.println("You have used Vortex Cannon");
	}
}