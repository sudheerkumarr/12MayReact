package day10;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

/*
 * Functional Interfaces
 *  interface which is having only one abstract method 
 *  allows default and static methods
 *  annotated with '@FunctionalInterface'
 *  
 * LambdaExpression: 
 *   public boolean isEven(int num) {
// *		if(num%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	Intf isEvenNum= (int num) -> {
// 		if(num%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	System.out.println(isEvenNum(10));
 */


//class Test implements Intf {
//
//	@Override
//	public boolean isEven(int num) {
//		if(num%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//}

// Functional Interfaces: 

@FunctionalInterface
interface Intf {
	boolean isEven(int num);
}

@FunctionalInterface
interface Intf1 {
	int add(int x, int y);
}

@FunctionalInterface
interface Intf2 {
	void greet();
	//int sub(int x, int y); //we can't write more than one abstract method in functional interface
	default void m1() {};
	default void m2() {};
	static void m3() {};
	static void m4() {};
}


// Predefined functional interfaces

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
//		Test t = new Test();
//		t.isEven(10);
		
		
		// Functional Programming
		Intf intf= (int num) -> {
	 		if(num%2==0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(intf.isEven(10)); // true
	
		Intf1 intf1 = (int x, int y) -> x+y;
		System.out.println(intf1.add(10,20));// 30
			
		Intf2 intf2= () -> System.out.println("Hello World");
		intf2.greet();
		
		
		// Predicate functional interface
		//  public abstract boolean test(T);
		Predicate<Integer> p= (Integer num) -> num%2==0? true: false;
		System.out.println(p.test(1001)); //false
		
		// Consumer
		// public abstract void accept(T);
		Consumer<String> c= (String name) -> System.out.println("Hello "+name);
		c.accept("Ram"); // Hello Ram
		
		// Supplier
		//public abstract T get();
		Supplier s= ()-> "Hello World";
		System.out.println(s.get()); // Hello World
			
	
	}

//	int add(int x, int y) {
//		return x+y;
//	}
	
	
/*
 * void greet(String name) {
 *    System.out.println("Hello "+name);
 * }
 */

}

