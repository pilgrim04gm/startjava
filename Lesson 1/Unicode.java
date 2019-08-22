public class Unicode {
	public static void main(String[] args) {
		int transfer = 0; // counting 10 signs and transfering to new line
		for(int i = 33; i <= 126; i++) {
			System.out.print((char) i + " ");
			transfer++;
			if (transfer / 10 > 0) {
				System.out.println();
				transfer = 0;
			}
		}		
	}
}