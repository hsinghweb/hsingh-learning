package effective.java.item1;

import java.util.HashMap;
import java.util.Map;

class Cache<K,V> { 
	
	private Map<K,V> map;

	public Cache() {
		this.map = new HashMap<K,V>();
	}
	
	public V get(K key) {
		return map.get(key);
	}
	
	public void put(K key, V value) {
		map.put(key, value);
	}
	
	
	/**
	 * Static factory method to make use of type inference, so that type should not be mentioned
	 * two times (for java 6). For constructor you have to write type two times (till java 6).
	 * @return
	 */
	public static <K, V> Cache<K, V> newInstance() {
		return new Cache<K, V>();
	}
}


public class TypeInference {
	public static void main(String[] args) {
		// In java 6 using constructor
		Cache<Integer, String> cache1 = new Cache<Integer, String>();
		cache1.put(1, "One");
		System.out.println(cache1.get(1));
		

		// In java 6 using static factory method, you can avoid typing types two times.
		// Because in static factory method the actual type will be inferred from right side. 
		Cache<Integer, String> cache2 = Cache.newInstance();
		cache2.put(2, "Two");
		System.out.println(cache2.get(2));
	}
}