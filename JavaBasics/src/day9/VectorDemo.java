package day9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import day6.E;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		v.addElement("Hello");
		v.addElement(new Employee());
		v.addElement(new Employee());
		v.addElement(new Student());
		
		// Iterate vector elements
		Enumeration enm= v.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		List v1 = new Vector();
		v1.add(10);
		v1.add(10.45f);
		v1.remove(0);
		v1.add(new Employee());
		v1.add(new Employee());
		v1.add(new Student());
		
		System.out.println();
		// Iterate vector elements
		Iterator<E> itr = v1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
