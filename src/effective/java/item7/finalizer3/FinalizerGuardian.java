package effective.java.item7.finalizer3;

class A {

	// this will work even if you forget to chain finalizer in subclass.
	// once this object will go for Garbage Collection, then the inner class object
	// will also go for Garbage Collection, and in that case the finalize method for
	// inner class
	// will be called.
	// Sine inner class can access outer class methods so it will call finalize for
	// outside class.

	// This idiom ensures that finalize will always be called whenever the object
	// goes for GC.
	// Sole purpose of this object is to finalize outer A object
	private final Object finalizerGuardian = new Object() {
		@Override
		protected void finalize() throws Throwable {
			// Finalize outer Foo object
			System.out.println("Finalize outer object A");
		}
	};

	public A() {
		System.out.println("A Constructor");
	}

}

class B extends A {

	private final Object finalizerGuardian = new Object() {
		@Override
		protected void finalize() throws Throwable {
			// Finalize outer Foo object
			System.out.println("Finalize outer object B");
		}
	};
	
	public B() {
		System.out.println("B Constructor");
	}

}

/**
 * Demo to show that finalize guardian object idiom.
 * no finalizer is provided here
 * and no finalizer chaining is done
 * just because each class has an inner class object. So when outer class object goes for GC
 * at the same time inner class object also goes for GC. Since inner class can access outer class 
 * private methods, we can write all the code required to finalize outer class object.
 * 
 * Think it like moving the finalize method code to inner class' finalize method. This way you do
 * not need manual chaining of finalizer to superclass
 * @author hsingh
 *
 */
public class FinalizerGuardian {

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
