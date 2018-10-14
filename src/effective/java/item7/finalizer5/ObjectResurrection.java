package effective.java.item7.finalizer5;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is immortal, means objects of this class cannot be garbage
 * collected.
 * 
 * @author hsingh
 *
 */
class Immortal {

	// This static set is just to manage a extra reference for the objects reaching
	// to finalize stage.
	// Once an object is added, that will never be garbage collected.
	private static final Set<Immortal> immortals = new HashSet<>();

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Running finalize for " + this);
		immortals.add(this); // Resurrect the object by creating a new reference
	}

	public static Set<Immortal> getImmortals() {
		return immortals;
	}
	
	

}

public class ObjectResurrection {

	public static void main(String[] args) {
		Immortal immortal1 = new Immortal();
		Immortal immortal2 = new Immortal();
		Immortal immortal3 = new Immortal();

		// print objects when they are alive.
		System.out.println(immortal1);
		System.out.println(immortal2);
		System.out.println(immortal3);

		
		// above will prints objects as they are alive, and Immortal.immortals set will be empty now
		System.out.println(Immortal.getImmortals());
		
		// make all objects garbage collectable
		immortal1 = null;
		immortal2 = null;
		immortal3 = null;

		// call garbage collection
		System.gc();

		// wait for some time to give chance to run garbage collection thread
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// print objects again
		System.out.println(immortal1);
		System.out.println(immortal2);
		System.out.println(immortal3);

		
		// above will prints null but they are still alive through Immortal.immortals set
		System.out.println(Immortal.getImmortals());
	}

}
