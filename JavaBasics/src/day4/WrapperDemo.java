package day4;

/*
 * Wrapper Classes
 *  To convert primitive data types(byte, short, int, long, float, double, boolean, char) to object type
 *  
 *  Collections/Cloning/Serialization
 *  
 *  pkg - java.lang
 *  
 *  Wrapper classes
 *  Byte
 *  Short
 *  Integer
 *  Long
 *  Float
 *  Double
 *  Char
 *  Boolean
 * 
 * - Convert primitive to Object
 *   1. Constructors
 *   2. valueOf() - method
 *   3. Autoboxing
 *   
 * - Convert Object to primitive
 *   xxxValue() - xxx - premitive data type
 *   AutoUnboxing
 * 
 * - Wrapper Object to String Object
 *   toString()
 *   
 * - Convert String to primitive
 *   parseXXX()
 *   
 * - Convert primitive to String 
 *    valueOf()
 */

public class WrapperDemo {

	public static void main(String[] args) {
		// Convert primitive to Object
//	
//		int i = 100;
//		i.getClass().getName();
		
		// Option 1 - using constructor
		Integer i1 = new Integer(10);
		System.out.println(i1.getClass().getName()); //Integer
		System.out.println(i1); // 10
		
		// Option 2 - valueOf()
		int j = 100;
		Integer j1 = Integer.valueOf(j);
		
		float f = 10.40f;
		Float f1 = Float.valueOf(f);
		System.out.println(f1.getClass().getName());
		
		// Option 3: Autoboxing
		Integer k = 200;
		System.out.println(k.getClass().getName());//Integer
		
		Double d = 30.45;
		System.out.println(d.getClass().getName());// Double
		
		
		// Wrapper Object to primitive data type
		Integer i22 = 100;
		System.out.println(i22.getClass().getName());// Integer
		int i23 = i22.intValue();
		System.out.println(i22+" | "+i23);// 100 100
		
		Double d22 = 20.34;
		double d23 = d22.doubleValue();
		System.out.println(d22+" | "+d23 );// 20.34 20.34
		
		// AutoUnboxing
		int x = i22;
		//System.out.println(x.getClass().getName());
		
		
		System.out.println();
		// Convert wrapper object to String object
		// toString()
		System.out.println(d22.getClass().getName());// Double
		String str1  = d22.toString();
		System.out.println(str1.getClass().getName());// String
		
		System.out.println();
		// Convert primitive to String - valueOf()
		String str2 = String.valueOf(10);
		System.out.println(str2.getClass().getName());
		
		String str3 = String.valueOf(false);
		System.out.println(str3.getClass().getName());
		
		System.out.println();
		// Convert String to primitive - parseXXX()
		String str4 = "10";
		int x2 = 100;
		System.out.println(str4.getClass().getName());// String
		System.out.println(str4+x2);//10100
		
		int x1= Integer.parseInt(str4);
		System.out.println(x1); // 10
		
		System.out.println(x1+x2);//110
		
		
		
		

	}

}
