package day5;

public class Person {
	
	// fields
	String name; //default - null
	int age; // 0
	
	
	// Constructors
	// No arg constructor
	Person() {
		System.out.println("Inside no arg constructor");
	}
	
	// Parameterized constructors
	Person(String name) {
		this.name = name;
	}
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	Person(int age, String name) {
		this.name=name;
		this.age=age;
	}
	

	int add(int x, int y) {
		System.out.println("Inside int add method");
		return x+y;
	}
	
	float add(float x, float y) {
		return x+y;
	}
	
	float add(int x, float y) {
		return x+y;
	}
	
	float add(float x, int y) {
		return x+y;
	}
	
	double add(double x, double y) {
		return x+y;
	}
	
	double add(double x, double y, int z) {
		return x+y+z;
	}
	
	
	
	
}
