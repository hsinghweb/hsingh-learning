package effective.java.item1;

public class Interview1 {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);

		
		
		Integer j1 = 1000;
		Integer j2 = 1000;
		Integer j3 = new Integer(1000);
		
		System.out.println(j1==j2);
		System.out.println(j1==j3);
	}
}
