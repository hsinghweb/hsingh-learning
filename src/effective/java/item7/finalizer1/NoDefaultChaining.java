package effective.java.item7.finalizer1;

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
		System.out.println("B finalize");
	}
	
}

/**
 * Demo to show that finalize chaining is not done automatically.
 * @author hsingh
 *
 */
public class NoDefaultChaining {

	public static void main(String[] args) throws Exception {
		B b = new B();
		b=null;
		// garbage collector is called
		System.gc();

		// thread sleeps for 10 sec
		Thread.sleep(10000);

		System.out.println(b);

	}
}
