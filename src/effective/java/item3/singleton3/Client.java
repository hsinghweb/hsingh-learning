package effective.java.item3.singleton3;

import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		
		// these two statement will print same output
		System.out.println(singleton1);
		System.out.println(singleton2);
	
		try {
			//load class
			Class c = Class.forName("effective.java.item3.singleton3.Singleton");
			//get all constructors (whether public or private)
			Constructor[] constructors = c.getDeclaredConstructors();
			//suppress access check errors
			constructors[0].setAccessible(true);
			//instance no 1
			System.out.println(constructors[0].newInstance());
			//instance no 2
			System.out.println(constructors[0].newInstance());
		} catch (Exception e) {
				e.printStackTrace();
		} 
	}
}
