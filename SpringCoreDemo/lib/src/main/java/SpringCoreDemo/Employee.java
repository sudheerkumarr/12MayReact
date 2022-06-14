package SpringCoreDemo;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int empId;
	private String name;
	private String deptName; // HR, IT etc.,
	
	private Address address;
	
	//private List<String> contactNos;
	
	// Constructors
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Employee(int empId, String name, String deptName) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptName = deptName;
	}
	
	public void initMethod() {
		System.out.println("Init method");
	}
	public void destroyMethod() {
		System.out.println("Destroy method");
	}
	
	
	
	
	
	

}
