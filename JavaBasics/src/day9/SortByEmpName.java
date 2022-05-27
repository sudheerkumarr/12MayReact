package day9;

import java.util.Comparator;

public class SortByEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp2.name.compareTo(emp1.name); //desc order
		// return emp1.name.compareTo(emp2.name); // asc order
	}

}
