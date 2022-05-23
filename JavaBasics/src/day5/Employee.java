package day5;

public class Employee extends Person{

	// Fields
	int empId;
	String dept;
	
	// HAS -A relationship
	Address address;
	
	// Constructors
	public Employee() {}
	
	public Employee(int empId, String dept, Address address) {
		super();
		this.empId = empId;
		this.dept = dept;
		this.address = address;
	}

	public Employee(String name, int age) {
		super(name, age);
	}
	
	public Employee(String name, int age,int empId, String dept, Address address) {
		super(name, age);
		this.empId = empId;
		this.dept = dept;
		this.address = address;
	}
	
	
	
	
	

}


  
  