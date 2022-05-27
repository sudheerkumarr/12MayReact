package day9;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		// Create LinkedList
				List ll = new LinkedList();
				
				// Add elements to LinkedList
				ll.add(10);
				ll.add(true);
				ll.add("hello");
				
				// Update
				ll.set(1,false);
				
				// Read
				System.out.println(ll.get(0));//10
				
				System.out.println();
				for(int i =0; i<ll.size(); i++) {
					System.out.println(ll.get(i)); //10, true
				}
				
				// remove
				ll.remove(2);
				
				// iterate
				// Option 1: using for loop
				System.out.println();
				for(int i =0; i<ll.size(); i++) {
					System.out.println(ll.get(i)); //10, true
				}
				
				System.out.println();
				// Option 2: using iterator
				Iterator itr = ll.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next()); //10, true
				}
				
				// Option 3: using ListIterator - supports List alone
				System.out.println();
				ListIterator listItr= ll.listIterator();
				
				// reading elements from beginning to end
				while(listItr.hasNext()) {
					System.out.println(listItr.next());
				}
				
				// reading elements from end to beginning
				System.out.println();
				while(listItr.hasPrevious()) {
					System.out.println(listItr.previous());
				}
				
				List al2 = new LinkedList();
				al2.add(20);
				al2.add('c');
				al2.add(null);
				al2.add(null);
				
				System.out.println();
				Iterator itr2 = al2.iterator();
				while(itr2.hasNext()) {
					System.out.println(itr2.next());
				}
				
				System.out.println();
				ll.addAll(al2);
				System.out.println(ll);
				
				System.out.println(ll.contains(false));// true
				System.out.println(ll.indexOf(false));// 1
				
				
				// 
				List al3 = new LinkedList();
				Employee emp1 = new Employee();
				Employee emp2 = new Employee();
				Employee emp3 = new Employee();
				
				Student std1 = new Student();
				Student std2 = new Student();
				Student std3 = new Student();
				
				al3.add(emp1);
				al3.add(emp2);
				al3.add(emp3);
				al3.add(std1);
				al3.add(std2);
				al3.add(std3);
				
				System.out.println();
				System.out.println(al3);
				
				Iterator itr3 = al3.iterator();
				while(itr3.hasNext()) {
					Object obj = itr3.next();
					if(obj instanceof Employee) {
						Employee emp = (Employee)obj;
						System.out.println(emp.id+" | "+emp.name+" | "+emp.dept);
					} else {
						Student std = (Student)obj;
						System.out.println(std.rollNo+" | "+std.name+" | "+std.age);
					}
				}
				
				
				// Generic Type
				List<Student> al4 = new LinkedList<>();
				al4.add(std1);
				al4.add(std1);
				al4.add(std2);
				al4.add(std3);
				
				
				for(Student std:al4) {
					System.out.println(std);
				}
			


	}

}
