package effective.java.item3.singleton7;

/**
 * Added some methods in this class which should be mocked.
 * Here an interface is implemented. and that interface will be used as type in Client code.
 * Also client will use constructor to inject the real object for SingletonInterface type. 
 * @author hsingh
 *
 */
public class Singleton implements SingletonInterface{
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	@Override
	public int getNumber() {
		return 1;
	}
	
	@Override
	public String getString() {
		return "Hello";
	}
}
