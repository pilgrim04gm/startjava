public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i < 21; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int a = 6;
		while ( a >= -6) {
			System.out.print(a + " ");
			a -= 2;
		}
		System.out.println();

		int s = 0;
		int i = 11;
		do {
			s += i;
			i += 2;
		} while ( i < 20);
		System.out.println(s);
	}
}