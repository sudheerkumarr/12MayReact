package pkg1;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.rollNo);
		System.out.println(student.name);
		System.out.println(Student.collegeName);
		System.out.println();
		System.out.println(student);//pkg1.Student@515f550a
		
		System.out.println();
		Employee emp1 = new Employee();
		// Read emp details
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpRole());

		System.out.println();
		// update emp details
		emp1.setEmpId(1001);
		emp1.setEmpName("Raj");
		emp1.setEmpRole("Admin");

		// Read emp details
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpRole());

	}

}
