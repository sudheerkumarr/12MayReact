/*
 * stmt 1
 * 
 * stmt5 - exception
 * 
 * 
 * stmt 7 - exception
 * 
 * 
 * stmt10
 * 
 * try
 * catch
 * finally
 * throw
 * throws
 * 
 * Throwable - root class for all Exceptions & Errors
 * 
 * Exceptions -
 *    Compile time exceptions:
 *      IO Exceptions
 *      SQL Exception
 *      ClassNotFound Exceptions
 *    Runtime Exceptions:
 *      ArithmeticException
 *      StringIndexOutOfBoundsException
 *      ArrayIndexOutOfBoundsException
 *      NumberFormatException
 *      
 *    ERROR: 
 *      StackOverFlowError
 *      OutOfMemoryError
 *      VirtualMachineError
 *      
 *      Throwable
 *         Exception
 *          IOException
 *          SQLException
 *          RuntimeException
 *            ArithmeticException
 *            ArrayIndexOutOfBoundsException
 *         Error
 */
package day7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	
	static String str; // null

	public static void main(String[] args)  {
		
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		System.err.println("Error Message");
		
//		String str= sc.next();
//		int i= Integer.parseInt(str);

		System.out.println("Enter 1st number: ");
	    int num1 = sc.nextInt();
	    System.out.println("Enter 2nd number: ");
	    int num2 = sc.nextInt();
	    
	    System.out.println(num1+" "+num2);
	    
	    System.out.println(num1/num2);// ArithmeticException when num2 value 0
	    
	    int[] intArr = {10, 15, 20, 35};
	    for(int i =0; i<intArr.length;i++) {// 0, 1, 2, 3, 4
	    	System.out.print(intArr[i]+" ");
	    }
	    
	    for(int i =0; i<=intArr.length;i++) {// ArrayIndexOutOfBoundsException
	    	System.out.print(intArr[i]+" ");
	    }
	    
	    String str = "Hello";
	    for(int i =0; i<str.length(); i++) {
	    	System.out.print(str.charAt(i)+" ");// H e l l o
	    }
	    
	    String str1 = "Hello";
	    for(int i =0; i<=str.length(); i++) {
	    	System.out.println(str.charAt(i)); //StringIndexOutOfBoundsException
	    }
	    
	    String str2 = "10";
	    // Convert String to int
	    int i1 = Integer.parseInt(str2);
	    System.out.println(i1);// 10
	    
	    
	    String str3 = "Hello";
	    int i2 = Integer.parseInt(str3);
	    System.out.println(i2);// NumberFormatException
		
*/	    
	    // Exception handling
	    // try-catch
		/*
	    try {
	    	// risk code
	    	System.out.println(10/2); // ArithmeticException
	    	
	    } catch (ArithmeticException e) {
	    	e.printStackTrace();// prints error info
	    }
	    
	    
	    
	    //Compiletime exception - FileNotFoundException
	    // try-catch
	    
	    try {
			FileReader fr = new FileReader("C:\\temp.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
	    // try-catch-catch
	    try {
	    	System.out.println(10/0); // ArithmeticException
			FileReader fr = new FileReader("C:\\temp.txt"); // FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	    
	    
	    try {
	    	System.out.println(str.length()); //NullPointerException
	    	System.out.println(10/0); // ArithmeticException
			FileReader fr = new FileReader("C:\\temp.txt");
	    }  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
	    
		
	    // try-catch-finally
	    try {
	    	System.out.println(Integer.parseInt("Hello")); // NumberFormatException
	    	//System.out.println(Integer.parseInt("100")); // 100
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	System.out.println("Inside finally block");
	    }
	    
	    // nested try-catch
	    try {
	    	System.out.println(Integer.parseInt("100")); // NumberFormatException
	    	//System.out.println(str.length()); // NullPointerException
	    	try {
	    		System.out.println(10/2); // 5
	    		//System.out.println(str.length()); // NullPointerException
	    	} catch(ArithmeticException e) {
	    		e.printStackTrace();
	    	}
	    } catch(NumberFormatException e) {
	    	try {
	    		e.printStackTrace();
	    	} catch (Exception e1) {
	    		e1.printStackTrace();
	    	}
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	// cleanup code to be written
	    	System.out.println("finally block");
	    }
	     */
		// try-catch
		try {
			System.out.println(10/2);//ArithmeticException
			System.out.println(Integer.parseInt("100")); // NumberFormatException
			int[] i = new int[] {10,20,30};
			System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		} catch(ArithmeticException | NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	    System.out.println("Outside try block");
	    
	    //Custom Exception
	    System.out.println("Enter age: ");
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    if(age<18) {
	    	throw new InvalidAge("Enter age greater than 18");
	    }
	    
	}

}
