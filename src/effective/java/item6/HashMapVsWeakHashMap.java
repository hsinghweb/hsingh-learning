package effective.java.item6;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Demo {
	public String toString() {
		return "demo";
	}

	// finalize method
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}

public class HashMapVsWeakHashMap {
	public static void main(String args[]) throws Exception {
		//Map<Demo, String> m = new HashMap<>();
		Map<Demo, String> m = new WeakHashMap<>();
		Demo d = new Demo();

		// puts an entry into HashMap
		m.put(d, " Hi ");
		System.out.println(m);
		
		// now remove any reference from outside to the hashmap key
		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 10 sec
		Thread.sleep(10000);

		System.out.println(m);
	}
}
