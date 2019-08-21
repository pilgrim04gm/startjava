public class ConditionalStatement{
	public static void main(String[] args){
		int yourAge = 30;
		if (yourAge > 20) {
			System.out.println("Your age is more than 20");
		}
		boolean youAreMale = true;
		if (youAreMale) {
			System.out.println("Male");
		}
		boolean youAreFemale = false;
		if (youAreFemale) {
			System.out.println("Female");
		}
		double yourHeight = 1.7;
		if (yourHeight < 1.80) {
			System.out.println("NotHigh");
		} else {
			System.out.println("High");
		}
		char yourNameFirstLetter = 'P';
		boolean yourNameBeginsWithLetterM = (yourNameFirstLetter == 'M'); 
		boolean yourNameBeginsWithLetterI = (yourNameFirstLetter == 'I');
		if (yourNameBeginsWithLetterM) {
			System.out.println("Your name begins with M");
		} else {
			if (yourNameBeginsWithLetterI) {
				System.out.println("Your name begins with I");
			} else {
				System.out.println("Your name doesn't begin with letters M or I");
			}
		} 
	}
}