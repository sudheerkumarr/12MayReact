package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// import statements


// Class declaration
@Entity
public class Address { // address - table created with this name
	
	// fields
	@Id
	@GeneratedValue
	private int addrId; // addr_id
	private String city; // city
	private String state; // state
	
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
	
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}	

}
