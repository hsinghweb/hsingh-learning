package effective.java.item1;

public class InstanceControlled {
	public static void main(String[] args) {
		Boolean b1 = true;
		Boolean b2 = true;
		Boolean b3 = new Boolean(true);
		Boolean b4 = Boolean.valueOf(true);
		
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		System.out.println(b1==b4);
	
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = new Integer(100);
		Integer i4 = Integer.valueOf(100);
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		

		Integer ii1 = 128;
		Integer ii2 = 128;
		Integer ii3 = new Integer(128);
		Integer ii4 = Integer.valueOf(128);
		
		System.out.println(ii1==ii2);
		System.out.println(ii1==ii3);
		System.out.println(ii1==ii4);
	}
}
