package day3;

/*
 * String - Non primitive data type
 *  Represents group of chars
 *  Strings are immutable
 *  SCP - String Constant Pool - part of Heap memory
 *  Heap Memory
 *  Ways to create strings: 
 *  1. String literals - stored in SCP area, maintains unique values
 *     String str1 = "Hello"; 
 *  2. new 
 *   String str1 = new String("Hello"); - stores in heap area
 */
public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello"; // 1 obj in SCP - Hello

		System.out.println(str1); // Hello
		System.out.println(str2); // Hello
		
		
		str1.concat(" World"); // 1 obj - Hello World
		System.out.println(str1); // Hello
		
		str1 = str1.concat(" World");
		System.out.println(str1); //Hello World
		
		
		str2 = "Hello World!"; // 1 obj - Hello World!
		System.out.println(str2); //Hello World!
		
		// Option 2 - using new keyword
		String str3 = new String("Java"); // 1 obj - heap - Java
		String str4 = new String("Java"); // 1 obj - heap - Java
		
		System.out.println(str3); // Java
		System.out.println(str4); // Java
		
		System.out.println();
		str3.concat(" Programming"); // 1 Obj - in heap
		System.out.println(str3);//Java
		
		str4 = str4.concat(" Programming");
		System.out.println(str4); // Java Programming
		
		// convert char arr to string
		char[] chArr = {'a','b', 'c', 'd' };
		
		System.out.println();
		String str = new String(chArr);
		System.out.println(str); // abcd
		
		// Ctrl+space
		System.out.println(str.length()); // 4
		System.out.println(str.charAt(2)); // c
		System.out.println(str.isEmpty()); // false
		System.out.println(str.toUpperCase()); // ABCD
		System.out.println();
		System.out.println("abcd".compareTo("abcd"));//0
		System.out.println("abcd".compareTo("Abcd")); //1st String > 2nd String - +ve
		System.out.println("Abcd".compareTo("abcd")); //1st String < 2nd String - -ve
		System.out.println("abcd".equals("abcd")); // true
		System.out.println("abcd".equals("Abcd")); // false
		System.out.println("abcd".equalsIgnoreCase("ABCD")); // true
		
		String[] strArr1 = "91 040 48888888".split(" ");
		System.out.println(strArr1[0]); // 91
		System.out.println(strArr1[1]); // 040
		System.out.println(strArr1[2]); // 48888888
		
		String newStr = String.join(" ", "Hello", "World");
		System.out.println(newStr);
		
		
		
		
		
		
		
		
		
		
	}

}
