package day3;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = sb1;
		StringBuffer sb6 = new StringBuffer("Hello World");
		
		System.out.println(sb1);
		
		sb1.append(" World");
		
		System.out.println(sb1);// Hello World
		
		System.out.println(sb1.hashCode()); //1365202186
		System.out.println(sb2.hashCode()); //1651191114
		System.out.println(sb3.hashCode()); //1365202186
		
		// equals() - compare  references
		System.out.println(sb1.equals(sb2));// false - compares ref
		System.out.println(sb1==sb2);// false - compare reference
		
		
		System.out.println(sb1.equals(sb3)); //ref comparision - true
		System.out.println(sb1==sb3); //ref comparision - true
		
		System.out.println(sb1.substring(1)); //ello World
		System.out.println(sb1.substring(6,11));// World
		
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());// default capacity - 16
		
		StringBuffer sb5 = new StringBuffer("Hello");
		System.out.println(sb5.capacity());//16+5 = 21
		
		sb4.append("12345678910121413123");
		System.out.println(sb4.capacity());// 34
		// new capacity = (OldCapacity * 2) + 2
		
		// StringBuilder
		StringBuilder sbr1 = new StringBuilder("Hello");
		StringBuilder sbr2 = new StringBuilder("Hello");
		
		System.out.println();
		System.out.println(sbr1.equals(sbr2)); // ref comparision - false
		System.out.println(sbr1==sbr2); // ref comparision - false
		
		// converting StringBuilder to String
		String str1 = new String(sbr1);
		String str2 = new String(sbr2);
		
		System.out.println(str1.equals(str2)); // true
		
		
		// Converting StringBuffer to String
		String str3 = new String(sb1);
		String str4 = new String(sb6);
		
		System.out.println(str3 instanceof String);
		System.out.println(str4 instanceof String);
		
		System.out.println(str3+ " | "+str4);
		System.out.println(str3.equals(str4)); // true
		
		System.out.println(sbr1.capacity()); //21
		
		//Reverse String
	    String str10 = new String("Hello World");
	
	    // String to StringBuffer
	    StringBuffer sb10 = new StringBuffer(str10);
	    System.out.println(sb10 instanceof StringBuffer); // true
	    
	    System.out.println(sb10.reverse());
		
		
		
		

	}

}
