public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 30;
		if (age > 20) {
			System.out.println("Your age is more than 20");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("Male");
		}

		if (!isMale) {
			System.out.println("Female");
		}

		double height = 1.7;
		if (height < 1.80) {
			System.out.println("NotHigh");
		} else {
			System.out.println("High");
		}

		char nameFirstLetter = 'P';
		if (nameFirstLetter == 'M') {
			System.out.println("Your name begins with M");
		} else {
			if (nameFirstLetter == 'I') {
				System.out.println("Your name begins with I");
			} else {
				System.out.println("Your name doesn't begin with letters M or I");
			}
		} 
	}
}