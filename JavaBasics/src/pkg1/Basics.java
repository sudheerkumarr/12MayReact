/*
 * pkg statement
 * import statements
 * class definition
 * variables - static/non static variables/local 
 *   static - className/Object reference
 *   non-static - object reference
 *   
 * Constructors
 * block - static/non static blocks
 * methods - 
 *   static/non static methods
 *   getter/setter methods
 * comments - can be any where
 * 
 * Naming Conventions -
 *   Class & Interface - UpperCamelCase
 *   Variables/Methods - lowerCamelCase
 *   Constants - UPPERCASE
 *   Packages - lowercase
 *   Constructor - Name of the class
 *   
 * Allowed characters to define names- 
 *   lower/upper case alphabets
 *   numbers
 *   special chars - $/_
 *   
 *   Keyword not allowed to define names of var/methods/class/interfaces ...
 *   
 *   Valid naming conventions
 *   ---------------------
 *   fred -  valid
 *   if - keywords - invalid
 *   2x - No, start's with number - invalid
 *   -4 - Invalid
 *   sum_total - valid 
 *   sumTotal - valid
 *   sum-total - Invalid
 *   sum total - Invalid
 *   sum.total - Invalid
 *   While - valid
 *   x2 - valid 
 *   Private - valid
 *   private - Invalid 
 *   public - Invalid 
 *   $16 - valid
 *   xTwo - valid 
 *   _static - valid
 *   static - Invalid
 *   _4 -Valid 
 *   ___ -valid
 *   10% - Invalid
 *   a27834 - valid
 *   wilma�s - Invalid
 *   
 * Data Types (8)
 *  byte
 *  short
 *  int
 *  long
 *  double
 *  float
 *  char
 *  boolean
 *  
 *  Default values
 *   byte - 0
 *   short - 0
 *   int - 0
 *   long - 0
 *   float - 0.0f
 *   double - 0.0
 *   boolean - false
 *   char - '\u0000'
 *  
 */

// - single line comment
/*
 * Multi
 * Line
 * Comment
 */

package pkg1;

public class Basics {


	// Variables
	int ___ = 100;
	int _4 = 100;
	int _a = 100;
	int $12 = 200;
	
	// Non static variable
	int x =100;
	int y = 100;
	int z; // 0
	
	// static variable
	static int num1= 100;
	
	
	// Constructors
	// No arg constructor
	Basics() {}
	
	// Parameterized constructor
	Basics(int num1, int num2) {
		this.x = num1;
		this.y = num2;
	}
	Basics(int num1, int num2, int num3) {
		this.x = num1;
		this.y = num2;
		this.z = num3;
	}
	
	// Methods - static method
	public static void main(String[] args) {
		//System.out.println(x);
		
		// create object
		Basics basics = new Basics();
		//sysout (Ctrl+Space)
		// Accessing non static members 
		System.out.println(basics.x);
		System.out.println(basics.y);
		System.out.println(basics.z);
		
		// Accessing static members
		System.out.println(num1);
		System.out.println(basics.num1);
		System.out.println(Basics.num1);

	}

}
