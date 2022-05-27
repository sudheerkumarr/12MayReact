package day9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.add(10);
		st.add(10.34f);
		st.add("Hello");
		st.add(null);
		st.add(null);
		st.add(10);
		st.add(100);
		
		//iterate - for, foreach, Iterator, Enumeration
		Enumeration en = st.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// LIFO
		// get last inserted element
		System.out.println();
		System.out.println(st.peek()); //100
		
		// add new element to stack
		
		st.push(new Employee());
		System.out.println();
		ListIterator lst = st.listIterator();
		while(lst.hasNext()) {
			System.out.println(lst.next());
		}
		
		// print last inserted element/peek element
		System.out.println();
		System.out.println("Peek Element");
		System.out.println(st.peek());
		
		System.out.println();
		// remove element from stack
		st.pop();
		
		
		// read stack after removing last element
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Generics
		Stack<String> st1 = new Stack<>();
		st1.add("aa");
		st1.add("bb");
		
	}

}
