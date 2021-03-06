package SpringCoreDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
//	Employee emp	= new Employee(1001, "Ram", "HR");
	// Address addr = new Address(2001, "Bengaluru", "Karnataka");
		
		// Setter Injection
		// emp.setAddress(addr);
		// System.out.println(emp.getAddress());
		
		
		// Constructor injection
		// Employee emp1 = new Employee(1002, "Sam", "IT", addr);
//	
//	emp.setEmpId(10);
//	System.out.println(emp.getEmpId());
		// Types of spring containers
		// 1. BeanFactory  and 2.ApplicationContext
		
		// Constructor injection
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
		 BeanFactory factory=new XmlBeanFactory(resource);
		 
		Employee emp = (Employee) factory.getBean("empBean1");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getDeptName());
		
		emp.setDeptName("HR");
		System.out.println(emp.getDeptName());
		
		System.out.println();
		Employee emp2 = (Employee)factory.getBean("empBean2");
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getName());
		
		System.out.println();
		Employee emp3 = (Employee)factory.getBean("empBean3");
		
		System.out.println(emp3.getEmpId());
		System.out.println(emp3.getName());
		System.out.println(emp3.getDeptName());
		
		
		// Application context
		System.out.println();
		ApplicationContext context =   
		   		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp4 = (Employee)context.getBean("empBean1");
		System.out.println(emp4.getEmpId());
		System.out.println(emp4.getName());
		System.out.println(emp4.getDeptName());
		
		// get emp bean with addr.
		System.out.println();
		Employee emp5 = (Employee)context.getBean("empBean4");
		System.out.println(emp5.getEmpId());
		System.out.println(emp5.getName());
		System.out.println(emp5.getDeptName());
		System.out.println(emp5.getAddress());
		
		
		// get address bean/obj
		System.out.println();
		Address addr1= (Address)context.getBean("addrBean1");
		System.out.println(addr1.getCity());
		System.out.println(addr1.getState());
		
		// get addr2 obj
		System.out.println();
		Address addr2 = (Address)context.getBean("addrBean2");
		System.out.println(addr2.getCity());
		System.out.println(addr2.getState());
		
		
		
		
		// Setter Injection example
		System.out.println();
		ApplicationContext context1 =   
		   		new ClassPathXmlApplicationContext("applicationContextSetterInj.xml");
		
		
		// get bean
		Employee emp6= (Employee)context1.getBean("empBean1");
		Employee emp7= (Employee)context1.getBean("empBean1");
		
		System.out.println(emp6.getEmpId());
		System.out.println(emp6.getName());
		System.out.println(emp6.getDeptName());
		System.out.println(emp6.getAddress());
		
		//scope- singleton
//		System.out.println();
//		System.out.println(emp6==emp7); //true
//		System.out.println(emp6.hashCode()); //832347217
//		System.out.println(emp7.hashCode()); //832347217
		
		//scope- prototype
		System.out.println();
		System.out.println(emp6==emp7); //false
		
		// Annotation based configuration example
		System.out.println();
		ApplicationContext context2 =   
		   		new ClassPathXmlApplicationContext("applicationContextAnnotationConfig.xml");
		
		Student stud1 = context2.getBean("stud", Student.class);
		System.out.println(stud1.getRollNo()); //0
		System.out.println(stud1.getName()); // null
		System.out.println(stud1.getAge()); // 0
		
		stud1.setRollNo(100);
		stud1.setName("Sam");
		stud1.setAge(20);
		
		System.out.println(stud1.getRollNo()); //100
		System.out.println(stud1.getName()); // Sam
		System.out.println(stud1.getAge()); // 20
		
		
		System.out.println();
		// Javabased config example
		AnnotationConfigApplicationContext context3 =
				new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer customer= (Customer)context3.getBean("customer", "Customer.class");
		System.out.println(customer.getCustId());
		System.out.println(customer.getName());
		System.out.println(customer.getContactNo());
		
		
		
	}

}
