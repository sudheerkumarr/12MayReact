package day9;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	int age;
	
	// Constructor
	public Student() {}
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	// Sort based on name
	@Override
	public int compareTo(Student obj) {
		//return this.name.compareTo(obj.name); // asc order
		return obj.name.compareTo(this.name);// desc order
	}
	
	/*
	// Sorting based on age
	@Override
	public int compareTo(Student obj) {
		if(this.age==obj.age) {
			return 0;
		} else if(this.age>obj.age) {
			return 1;
		} else {
			return -1;
		}
		
	}
	*/
	
	
	
}
