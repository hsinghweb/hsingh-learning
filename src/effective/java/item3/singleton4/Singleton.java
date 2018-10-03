package effective.java.item3.singleton4;

import java.io.Serializable;

public class Singleton implements Serializable {
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	// readResolve method to preserve singleton property
	// commenting this method, will break singleton in client code
	private Object readResolve() {
		return INSTANCE;
	}
}
