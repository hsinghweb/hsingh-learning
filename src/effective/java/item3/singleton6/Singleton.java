package effective.java.item3.singleton6;

/**
 * Added some methods in this class which should be mocked.
 * @author hsingh
 *
 */
public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public int getNumber() {
		return 1;
	}
	
	
	public String getString() {
		return "Hello";
	}
}
