package effective.java.item7.finalizer4;

class A {

	public A() {
		System.out.println("A Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		boolean running = true;
		System.out.println("Running finalize.");
		while (running) {
			Thread.currentThread().yield();
		}
		System.out.println("It will never reach here.");
	}

}

/**
 * Demo to stop finalize from completing.
 * @author hsingh
 *
 */
public class AvoidFinalize {

	public static void main(String[] args) throws Exception {
		A a = new A();
		a = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 10 sec
		Thread.sleep(10000);

		System.out.println(a);
	}
}
