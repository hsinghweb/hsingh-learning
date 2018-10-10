package effective.java.item3.singleton6;

public class Client {
	private Singleton singleton = Singleton.getInstance();

	public int getNumber() {
		return singleton.getNumber();
	}

	public String getString() {
		return singleton.getString();
	}
}
