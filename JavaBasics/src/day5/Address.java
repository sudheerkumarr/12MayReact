package day5;

public class Address {

	String city;
	String state;
	
	// Constructors
	public Address() {}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
