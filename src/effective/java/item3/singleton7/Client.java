package effective.java.item3.singleton7;

public class Client {
	
	// Do not initialize this singleton instance.
	private SingletonInterface singleton;
	
	public Client(SingletonInterface singleton) {
		this.singleton = singleton;
	}

	public int getNumber() {
		return singleton.getNumber();
	}

	public String getString() {
		return singleton.getString();
	}
}
