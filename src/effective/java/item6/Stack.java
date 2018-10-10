package effective.java.item6;

public class Stack {
	
	private Object[] array;
	private int size = 0;

	public Stack(int capacity) {
		array = new Object[capacity];
	}

	public void push(int e) {
		array[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new RuntimeException("Stack is empty.");

		//below line just decrease the size but the object at index size is not nullified.
		// So object at the size index will be unused by the stack and if a new object is pushed then 
		// that object will be replaced by new pushed object.
		// The problem here is that JVM will not get to know that the object is unused
		// JVM will only get to know if an object has no more reference from any live thread.
		// so this creates a memory leak problem
		return array[--size];
	}
}
