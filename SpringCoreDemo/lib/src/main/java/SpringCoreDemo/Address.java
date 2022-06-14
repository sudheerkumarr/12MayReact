package SpringCoreDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	// fields
	@Id
	private int addrId;
	private String city;
	private String state;
	
	//Constructors
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	
}
