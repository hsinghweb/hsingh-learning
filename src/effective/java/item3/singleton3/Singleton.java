package effective.java.item3.singleton3;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		if (INSTANCE !=null) {
			// commenting below line, will break the singleton by reflection in Client code.
			throw new RuntimeException("Singleton instance has been already instantiated.");
		}
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
}
