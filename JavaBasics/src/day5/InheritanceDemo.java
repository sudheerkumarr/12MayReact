/*
 * Inheritance - code re usability
 *   Process of aquiring parent class to child child
 *   
 * 'extends' keyword to implement relationship between classes
 * 
 *   
 * Types
 *  Single
 *  Multilevel
 *  Multiple
 *  hierarchy
 *  Hybrid
 *  
 *  
 *  IS-A relationship
 *  
 */
package day5;

public class InheritanceDemo {

	public static void main(String[] args) {
		// Single
		// Ways to create object
		// Option 1 - Ref and Obj type is Parent
		// we can access only parent class properties
		Parent p1 = new Parent();
	    System.out.println(p1.x);
	    System.out.println(p1.y);
	    p1.m1();
	    p1.m2();
	    		
	    System.out.println();
	    
	    // Option 2: Ref & Obj type is Child
	    // can access both child & parent class properties
	    // child class properties
		Child1 c1 = new Child1();
		System.out.println(c1.i);
		System.out.println(c1.j);
		c1.m3();
		
		// Parent class properties
		System.out.println();
		System.out.println(c1.x);
		System.out.println(c1.y);
		c1.m1();
		c1.m2();
	
		// Option 3: ref is parent & obj child
		// during compilation, complier checks methods defined in parent or not 
		// and during runtime JVM executes child class methods.
		// Overriding
		Parent p2 = new Child1();
		
		System.out.println(p2.x);
		System.out.println(p2.y);
		p2.m1();
		p2.m2();
		
		
		
		//Child1 c2 = new Parent();


		// Multi level
		GrandChild gc1 = new GrandChild();
		System.out.println(gc1.a);
		System.out.println(gc1.b);
		
		System.out.println(gc1.i);
		System.out.println(gc1.j);
		
		System.out.println(gc1.x);
		System.out.println(gc1.y);
		
		// Hierarchical
		
		System.out.println();
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		
		System.out.println(ch1.i);
		System.out.println(ch1.x);
		
		System.out.println(ch2.m);
		System.out.println(ch2.x);
		
		// create emp obj
		// create obj using no arg constructor
		Employee emp1 = new Employee();
		
		// update values
		emp1.empId=1001;
		emp1.name = "Ram";
		emp1.age = 21;
		emp1.dept="IT";
		
		Address addr1 = new Address();
		addr1.city="Chennai";
		addr1.state="Tamilnadu";
		
		emp1.address=addr1;
		
		// Read
		System.out.println(emp1.name);
		System.out.println(emp1.address);
		System.out.println(emp1.address.city);
		
		
		// create object using parameterized constructor
		Address addr2 = new Address("Bangalore", "Karnataka");
		Employee emp2 = new Employee("Sam", 22, 1002, "Admin", addr2);
		
		// read values
		System.out.println();
		System.out.println(emp2.name);
		System.out.println(emp2.address);
		System.out.println(emp2.address.city);
		
		
		
		
		
	}

}
