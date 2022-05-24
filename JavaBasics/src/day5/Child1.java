package day5;

/*
 * Only inherited methods can be overridden
Final and static methods cannot be overridden.
The overriding method must have same argument list.
The overriding method must have same return type (or subtype)
The overriding method must not have more restrictive access modifier.
 public - public
 protected - protected/public
 */
public class Child1 extends Parent{
	
	int i =20;
	int j= 30;
	
	
	void m3() {
		System.out.println("Child1 m3 method");
	}
	
	Employee m1() {
		System.out.println("Child1 m1 metod");
		return new Employee();
	}
	
	/*
	Object m1() {
		System.out.println("Child1 m1 metod");
		return new Object();
	}
	*/
	void m2() {
		System.out.println("Child1 m2 metod");
	}

}
