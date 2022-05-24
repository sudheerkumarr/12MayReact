/*
 * Basic principles of Java
 * Class
 * Object
 * Polymorphism -
 *  One action can be performed in multiple ways
 *  compile time  polymorphism
 *   constructor overloading -
 *     Order should be different
 *     number of input arguments should be different
 *     data type should be different
 *     Name of constructor is same as class
 *    
 *   method overloading -
 *   Order should be different
 *   number of input arguments should be different
 *   data type should be different
 *    
 *   operator overloading - java won't support
 *     +
 *     - String - concat
 *     - numbers - add 
 *     
 *     
 *  Run time polymorphism-
 *    Method Overriding
 *    
 * Inheritance
 * Abstraction
 * Encapsulation
 * 
 */
package day5;

public class PolymorphismDemo {
	
	
	{
		System.out.println("Inside Non static block");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		
		
		// Create object - no arg constructor
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		
		// read values
		System.out.println(p1.name);// null
		System.out.println(p1.age); //0
		
		// update
		p1.name="Ram";
		p1.age=20;
		
		
		p2.name="Sam";
		p2.age=21;
	
		
		System.out.println(p1.name);// Ram
		System.out.println(p2.age); //20
		
		//create obj using constructor with 3 input arguments
		Person p3 = new Person("Jhon", 23);
		System.out.println(p3.name+" "+p3.age);
		
		// call add method
		int sum = p1.add(10,20);
		System.out.println(sum);// 30
		
		System.out.println(p1.add(10.23f, 30.23f));//40.46
		
		System.out.println("Hello"+" "+"World");//Hello World
		System.out.println(20+30);//50
		
		//
		
		
		
		
		
	}

	
}
