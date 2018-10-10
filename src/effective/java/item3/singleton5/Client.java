package effective.java.item3.singleton5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[] args) {
		
		// try to break through reflection
		try {
			//load class
			Class c = Class.forName("effective.java.item3.singleton5.Singleton");
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
		
		
		// try to break through deserialization
		try
        { 
            Singleton instance1 = Singleton.INSTANCE;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text")); 
            out.writeObject(instance1); 
            out.close(); 
      
            // deserialize from file to object 
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text")); 
              
            Singleton instance2 = (Singleton) in.readObject(); 
            in.close(); 
      
            System.out.println(instance1.hashCode()); 
            System.out.println(instance2.hashCode()); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
		
		
	}
}
