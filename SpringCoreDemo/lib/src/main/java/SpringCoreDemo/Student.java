package SpringCoreDemo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("stud") // bean id
public class Student {

	private int rollNo;
	private String name;
	private int age;
}
