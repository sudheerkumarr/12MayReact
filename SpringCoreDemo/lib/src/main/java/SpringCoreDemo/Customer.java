package SpringCoreDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Customer {

	@Value("${cust1.id}")
	private int  custId;
	
	@Value("${cust1.name}")
	private String name;
	
	@Value("${cust1.contactNo}")
	private String contactNo;
}
