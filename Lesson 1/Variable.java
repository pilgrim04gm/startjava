import java.util.ArrayList;

public class Variable{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		byte a = 4;
		list.add(a);
		short b = 10;
		list.add(b);
		int c = 64;
		list.add(c);
		long d = 240;
		list.add(d);
		float e = 4;
		list.add(e);
		double f = 1.8;
		list.add(f);
		char g = 'D';
		list.add(g);
		boolean h = 1>0;
		list.add(h);
		for(Object object: list)
			System.out.println(object);
	}
}