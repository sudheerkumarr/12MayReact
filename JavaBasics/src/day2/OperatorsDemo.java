package day2;

/*
 * Operators:
 * int x = 10
 * Unary - Postfix - expr++ - x++;//10
 *                   expr--
 *         Prefix
 * Arithmetic - +, - , * , /, %
 * shift - <<, >>
 * Assignment - =, +=, -=, *=, %=, /=
 * Logical - &&(AND), ||(OR), !(Logical Not)
 * Bitwise - &(AND), ^(XOR), |(OR)
 * Ternary - ?:
 *   int age = 10;
 *   age>18?sop("Major"):sop("Minor");
 *   
 *   if(age>18) {
 *      System.out.println("Major");
 *   } else {
 *   	System.out.println("Minor");
 *   }
 *   
 *Conditional statements:  
 *  if:
 *  if(condition) {}
 *  
 *  if-else:
 *  if(condition 1) {
 *     //
 *  } else {
 *  
 *  }
 *  
 *  if-else if- else if - else:
 *  if(condition 1) {
 *     // logic
 *  }  else if(condition 2){
 *  	// logic 2
 *  } else if(condition 3) {
 *  	// logic 3
 *  } else {
 *      // default logic will execute when conditions not match
 *  }
 *  
 *  
 *  switch:
 *  int x = 2;
 *  switch(x) {
 *    case 1: // logic
 *            break;
 *    case 2: // logic 2
 *            break;
 *    case 3: // logic 3
 *            break;
 *    default: // default logic
 *  }
 *  
 *  Loops :
 *  for:
 *   for(int i =0; condition; incr/decr) {
 *     // logic
 *   }
 *  
 *  foreach:
 *    for(boolean ele:array) {
 *      // logic
 *      System.out.println(ele);
 *    }
 *   
 *  while(condition) {
 *  	// logic
 *  }
 *  
 *  do {
 *  	// logic
 *  } while(condition)
 *  
 */
public class OperatorsDemo {

	public static void main(String[] args) {
		int x =10;
		int y = 20;
		int sum = 0;
		
		// postfix
		System.out.println(x++); //10
		System.out.println(x); // 11
		System.out.println();
		System.out.println(x--); // 11
		System.out.println(x); //10
		
		System.out.println();
		// prefix
		System.out.println(++x); // 11
		System.out.println(x); // 11
		System.out.println();
		System.out.println(--x); // 10
		System.out.println(x); // 10
		
		//sum= sum+x; //30
		sum+=x; //30
		
		// Arrays
		/*
		 * store more than one value
		 * supports homogeneous elements
		 * size of array fixed
		 * Better performance
		 * No predefined methods
		 * length - returns length of array
		 * last element index value  - (length -1)
		 * index values start from 0
		 * 
		 * two ways to define array
		 * without new key word
		 * int[] intArr = {10 , 20, 30, 40};
		 * 
		 * with new Keyword
		 * int[] intArr = new int[10];
		 * int[] intArr = new int[]{10, 20, 30, 40, 50};
		 * 
		 * 
		 */
		// One Dimensional array
		int[] intArr = {10 , 20, 30, 40};
		System.out.println(intArr[0]);
		System.out.println(intArr[2]);
		
		System.out.println();
		// iterate array
		for(int i=0; i<intArr.length; i++ ) {
			System.out.println(intArr[i]);//10, 20, 30, 40 
		}
		
		System.out.println();
		//foreach
		for(int num:intArr) {
			System.out.println(num); //10, 20, 30, 40	
		}
		
		System.out.println();
		int j=0;
		while(j<intArr.length) {
			System.out.println(intArr[j]); //10, 20, 30, 40
			j++;
		}
		
		// update values in array
		intArr[1] = 200;
		intArr[3] = 400;
		
		System.out.println();
		System.out.println(intArr[1]);
		System.out.println(intArr[3]);
		
		System.out.println();
		// String array
		String[] strArr = new String[5];
		
		for(String str:strArr) {
			System.out.println(str); //null, null....
		}
		
		strArr[0] = "aa";
		strArr[1] = "bb";
		strArr[2] = "cc";
		strArr[3] = "dd";
		
		System.out.println();
		for(String str:strArr) {
			System.out.println(str); // aa, bb, cc, dd, null
		}
		
		System.out.println();
		System.out.println(strArr[3]); //dd
		
		// Employee Arrays
		Employee emp1 = new Employee(1001, "Ram");
		Employee emp2 = new Employee(1002, "Sam");
		Employee emp3 = new Employee(1003, "jhon");
		
		//Employee[] empArr = {emp1, emp2, emp3};
		Employee[] empArr = new Employee[6];
		
		System.out.println();
		for(Employee emp:empArr) {
			System.out.println(emp); //null, null, null...
		}
		
		empArr[0] = emp1;
		empArr[2] = emp2;
		empArr[4] = emp3;
		
		// iterate
		System.out.println();
		for(Employee emp:empArr) {
			System.out.println(emp); //emp1, null, emp2, null, emp3, null
		}
		
		// ignoring null values
		System.out.println();
		for(Employee emp:empArr) {
			if(emp instanceof Employee) {
				System.out.println(emp); //emp1, null, emp2, null, emp3, null	
			}
			
		}
		
	}

}
