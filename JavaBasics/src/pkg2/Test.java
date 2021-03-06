package pkg2;

import pkg1.Employee;
import pkg1.Student;

public class Test {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		System.out.println(std1.rollNo);
		System.out.println(std1.name);
		System.out.println(std1.collegeName);
		System.out.println(Student.collegeName);

		// Initialize student properties
		std1.name = "Ram";
		std1.rollNo = 101;
		std1.collegeName = "ABC College";

		std2.name = "Sam";
		std2.rollNo = 102;
		std2.collegeName = "ABC College";

		System.out.println(std1.rollNo);
		System.out.println(std1.name);
		System.out.println(std1.collegeName);

		System.out.println(std2.rollNo);
		System.out.println(std2.name);
		System.out.println(std2.collegeName);

		System.out.println();

		// Option 1 - create emp using no arg constructor
		Employee emp1 = new Employee();

		// Read emp details
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpRole());

		// update emp details
		emp1.setEmpId(1001);
		emp1.setEmpName("Raj");
		emp1.setEmpRole("Admin");

		// Read emp details
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpRole());

		System.out.println();

		// Option2 - create object with parameterized constructor
		Employee emp2 = new Employee(1002, "Jhon", "HR");
		// Read emp details
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getEmpName());
		System.out.println(emp2.getEmpRole());
		
		System.out.println();
		emp2.setEmpRole("Senior HR");
		System.out.println(emp2.getEmpRole());
		
		System.out.println(emp2); //pkg1.Employee@626b2d4a
		

	}

}
