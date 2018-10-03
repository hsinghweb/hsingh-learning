package effective.java.item3.singleton4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) {
		try
        { 
            Singleton instance1 = Singleton.getInstance(); 
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text")); 
            out.writeObject(instance1); 
            out.close(); 
      
            // deserialize from file to object 
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text")); 
              
            Singleton instance2 = (Singleton) in.readObject(); 
            in.close(); 
      
            System.out.println(instance1); 
            System.out.println(instance2); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
	}
}
