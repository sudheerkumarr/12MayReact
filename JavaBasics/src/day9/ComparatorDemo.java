package day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		// Create TreeSet Object
		//Set<Employee> employees= new TreeSet<>(new SortByEmpId());
		SortByEmpName sortByName = new SortByEmpName();
		Set<Employee> employees= new TreeSet<>(sortByName);
		
		// Create Employee Objects
		Employee emp1 = new Employee(1000, "Ram", "HR");
		Employee emp2 = new Employee(1001, "Sam", "IT");
		Employee emp3 = new Employee(1002, "Jhon", "IT");
		Employee emp4 = new Employee(1003, "Ravi", "Admin");
     	Employee emp5 = new Employee(1003, "Ravi", "Admin");
		Employee emp6 = emp1;
		
		// Add employees to TreeSet
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		
		
		// Iterate TreeSet
		Iterator itr = employees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
