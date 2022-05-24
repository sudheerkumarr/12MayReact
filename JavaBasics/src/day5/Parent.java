package day5;

public class Parent {

	int x = 10;
	final float pi = 3.12f;
	int y = 20;

	// non static block
	{
		// logic
	}

	// static block
	static {
		// logic
	}

	// methods

	Object m1() {
		System.out.println("Parent m1 metod");
		return new Object();
	}

	void m3() {

	}

	void m2() {
		System.out.println("Parent m2 metod");
	}

	void withdraw(double d) {
		// logic
		System.out.println("Parent class withdraw method");
	}

}
