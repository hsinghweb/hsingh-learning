package effective.java.item5;

public class AutoBoxing {

	public static void main(String[] args) {
		long startTimeStamp=System.currentTimeMillis();
		// below line is a problem
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			// because sum is an Long object, it will create a new Long object every time
			sum += i;
		}
		System.out.println(sum);
		System.out.println("Time taken in ms: " + (System.currentTimeMillis() - startTimeStamp)); 
	}
}
