package pkg1;

public class Employee {
	
	private int empId;
	private String empName;
	private String empRole;
	
	// Constructor
	public Employee() {}
	
	public Employee(int id, String name, String role) {
		this.empId = id;
		this.empName = name;
		this.empRole = role;
	}
	
	// Getters & Setters
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int eId) {
		this.empId = eId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	// toString() method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}
	
	
	
	
}
