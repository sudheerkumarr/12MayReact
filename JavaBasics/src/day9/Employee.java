package day9;


import java.util.Objects;

public class Employee{
	int id;
	String name;
	String dept;
	
	// Constructors
	public Employee() {}
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	// Override equals & hashcode method
	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name);
	}
	
	

	
	
	
}
