package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*  Collection(I)
 *     Set(I)
 *       HashSet(C) -
 *         Insertion order won't maintain
 *         duplicates won't allow
 *         null values allowed - only once
 *       LinkedHashSet(C)
 *         - Insertion order won't maintain
 *         - duplicates won't allow
 *         - null values allowed - only once
 *         - Insertion order preserved
 *         SortedSet(I)
 *            TreeSet(C)
 *              - Insertion order won't maintain
 *         		- duplicates won't allow
 *         		- null values won't allow
 *         		- stores elements in ascending order
 *            
 *  - Heterogeneous elements support
 *  - insertion order - not preserved
 *  - null - allowed
 *  - duplicates - not allowed
 *  
 */
public class SetDemo {

	public static void main(String[] args) {
		
//		Set hashSet1 =new HashSet();
//		hashSet1.add(10);
//		hashSet1.add(false);
//		hashSet1.add("Hello");
//		
//		
		Set<Employee> hashSet2 = new HashSet<>();
		Employee emp1 = new Employee(1000, "Ram", "HR");
		Employee emp2 = new Employee(1001, "Sam", "IT");
		Employee emp3 = new Employee(1002, "Jhon", "IT");
		Employee emp4 = new Employee(1003, "Ravi", "Admin");
     	Employee emp5 = new Employee(1003, "Ravi", "Admin");
		Employee emp6 = emp1;
		
		
		// Add emp objects to HashSet
		hashSet2.add(emp1); 
		hashSet2.add(emp2);
		hashSet2.add(emp3);
		hashSet2.add(emp4);
		hashSet2.add(emp5);
		hashSet2.add(emp6);
		
		
		System.out.println();
		System.out.println(emp1.hashCode()); //1023487453
		System.out.println(emp2.hashCode()); //1865127310
		System.out.println(emp3.hashCode()); //515132998
		System.out.println(emp4.hashCode()); //1694819250
		System.out.println(emp5.hashCode()); //1365202186
		System.out.println(emp6.hashCode()); //1023487453
		
		
		Iterator itr = hashSet2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //emp1, emp2, emp3, emp4, emp5
			                              
		}
		
		
		// After overiding equals and hashcode method in Employee class to return code based on id, name and dept instead of obj address
		
		System.out.println();
		System.out.println(emp1.hashCode()); //2366463
		System.out.println(emp2.hashCode()); //2399168
		System.out.println(emp3.hashCode()); //4624349
		System.out.println(emp4.hashCode()); //527610501
		System.out.println(emp5.hashCode()); //527610501
		System.out.println(emp6.hashCode()); //2366463
		
		
		Iterator itr1 = hashSet2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next()); //emp1, emp2, emp3 and emp4
			                              
		}
		
		// allows null values
		hashSet2.add(null);
		hashSet2.add(null);
		
		System.out.println();
		Iterator itr2 = hashSet2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next()); //emp1, emp2, emp3 and emp4
			                              
		}
//		Set<Integer> intSet = new HashSet<>();
//		intSet.add(10);
//		intSet.add(5);
//		intSet.add(34);
//		intSet.add(34);
//		intSet.add(1200);
//		intSet.add(76);
//		intSet.add(100);
//		
//		Iterator itr1 = intSet.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next()); // 5, 10, 34, 1200, 76, 100
//		}
		
		
		System.out.println(hashSet2.contains(emp5)); // true
		System.out.println(hashSet2.isEmpty()); // false
		
		//====================================================
		
		//LinkedHashSet
		
		Set set1 = new LinkedHashSet();
		
		set1.add(20);
		set1.add(false);
		set1.add("Ram");
		set1.add('d');
		set1.add(null);
		set1.add(20);
		
		System.out.println();
		Iterator itr3 = set1.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next()); //20, false, Ram, d, null
		}
		
		
		//==========================================================
		// TreeSet
		Set<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(109);
		set2.add(100);
		set2.add(345);
		set2.add(32);
		set2.add(87);
		//set2.add(null); // invalid, null value won't allow
		
		System.out.println();
		Iterator itr4 = set2.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next()); //10, 32, 87, 100, 109, 345
		}
		
		// Create TreeSet
		Set<Student> students = new TreeSet<>();
		
		
		// Create Student objects
		Student std1 = new Student(101, "Sai", 23);
		Student std2 = new Student(102, "Ramesh", 21);
		Student std3 = new Student(103, "Suresh", 20);
		Student std4 = new Student(104, "Kavitha", 22);
		Student std5 = new Student(104, "Kavitha", 22);
		Student std6 = std1;
		
		// Add student objects in TreeSet
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);
		
		
		// Print all student objects from TreeSet
		System.out.println();
		Iterator itr5= students.iterator();
		while(itr5.hasNext()) {
			System.out.println(itr5.next());//
		}
		
		

	}

}
