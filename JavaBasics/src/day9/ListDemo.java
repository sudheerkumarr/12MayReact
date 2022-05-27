package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Iterable(I)
 *   Collection (I) - Framework
 *     List(I)
 *        ArrayList(C)
 *         - Heterogeneous Elements
 *         - insertion order Preserved
 *         - Duplicates allowed
 *         - null values can be added
 *         - frequent operation is search
 *         - ways to iterate
 *            - iterator, ListIterator, for, foreach 
 *        LinkedList(C)
 *         - Heterogeneous Elements
 *         - insertion order Preserved
 *         - Duplicates allowed
 *         - null values can be added
 *         - frequent operations are remove/insert
 *         - ways to iterate
 *            - iterator, ListIterator, for, foreach 
 *        Vector(C)
 *        Stack(C)
 *     Set(I)
 *        HashSet(C)
 *        LinkedHashSet(C)
 *        SortedSet(I)
 *            TreeSet(C)
 *     Queue(I)
 *        PriorityQueue(C)
 *        DQueue(I)
 *          ArrayDqueue(C)
 * Map(I)
 *  HashMap(C)
 *  LinkedHashMap(C)
 *  SortedMap(I)
 *    TreeMap(C)
 *    
 *    
 *  
 */
public class ListDemo {

	public static void main(String[] args) {
		
		// Create ArrayList
		List al = new ArrayList();
		
		// Add elements to ArrayList
		al.add(10);
		al.add(true);
		al.add("hello");
		
		// Update
		al.set(1,false);
		
		// Read
		System.out.println(al.get(0));//10
		
		System.out.println();
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i)); //10, true
		}
		
		// remove
		al.remove(2);
		
		// iterate
		// Option 1: using for loop
		System.out.println();
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i)); //10, true
		}
		
		System.out.println();
		// Option 2: using iterator
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //10, true
		}
		
		// Option 3: using ListIterator - supports List alone
		System.out.println();
		ListIterator listItr= al.listIterator();
		
		// reading elements from beginning to end
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		// reading elements from end to beginning
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		List al2 = new ArrayList();
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
		al.addAll(al2);
		System.out.println(al);
		
		System.out.println(al.contains(false));// true
		System.out.println(al.indexOf(false));// 1
		
		
		// 
		List al3 = new ArrayList();
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
		List<Student> al4 = new ArrayList<>();
		al4.add(std1);
		al4.add(std1);
		al4.add(std2);
		al4.add(std3);
		
		
		for(Student std:al4) {
			System.out.println(std);
		}
		
		//ArrayList al5 = new ArrayList();
	}

}
