package com.example.entity;


// import statements


// Class declaration
public class Address {
	
	// fields
	private String city;
	private String state;
	
	// constructors
	public Address() {}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	
	//methods
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}	

}
