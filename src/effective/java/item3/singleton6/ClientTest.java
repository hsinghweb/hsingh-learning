package effective.java.item3.singleton6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientTest {
	
	// to test Client class, create an object of Client, here the internal Singleton class, you do not have any control.
	// the behavior of Singleton you cnanot mock here as it will be instantiated internally by Client.
	private Client client = new Client();

	@Test
	void test1() {
		Assertions.assertEquals(1, client.getNumber());
	}

	@Test
	void test2() {
		Assertions.assertEquals("Hello", client.getString());
	}
}
