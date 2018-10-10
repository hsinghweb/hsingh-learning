package effective.java.item3.singleton7;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClientTest {
	
	SingletonInterface singleton = Mockito.mock(SingletonInterface.class); 
	
	// Now you can inject the mocked Singleton object and later provide the behavior for mocked Singleton object.
	private Client client = new Client(singleton);

	@Test
	void test1() {
		when(singleton.getNumber()).thenReturn(1);
		Assertions.assertEquals(1, client.getNumber());
		verify(singleton, times(1)).getNumber();
	}

	@Test
	void test2() {
		when(singleton.getString()).thenReturn("Hello");
		Assertions.assertEquals("Hello", client.getString());
		verify(singleton, times(1)).getString();
	}
}
