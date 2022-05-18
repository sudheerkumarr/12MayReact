package day2;

public class Employee {
	// Fields
	long empId;
	String empName;
	
	
	// Constructors
	Employee() {
		
	}
	
	Employee(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
