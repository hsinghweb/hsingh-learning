package effective.java.item5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdapterTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		// map.keySet() provides an set view to keys
		Set<Integer> set = map.keySet();
		System.out.println(set);
		
		// changing keyset through view is not possible
		// uncommenting below line will throw runtime exception
		// think about channging DB table through views
		//set.add(4);
		
		// but changing the map will be reflected in keySet
		map.put(4, "Four");
		
		// Again you can compare this with DB table views, changing the table reflects changes in views
		System.out.println(set);
	}
}