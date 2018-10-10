package effective.java.item7.finalizer2;

class A {

	public A() {
		System.out.println("A Constructor");
	}

	@Override
	public void finalize() {
		System.out.println("A finalize");
	}
}

class B extends A {

	public B() {
		System.out.println("B Constructor");
	}

	@Override
	public void finalize() {
		try {
			System.out.println("B finalize");
		} finally {
			super.finalize();
		}
	}

}

/**
 * Demo to show manual finalize chaining.
 * 
 * @author hsingh
 *
 */
public class ManualChaining {

	public static void main(String[] args) throws Exception {
		B b = new B();
		b = null;
		// garbage collector is called
		System.gc();

		// thread sleeps for 10 sec
		Thread.sleep(10000);

		System.out.println(b);

	}
}
