package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo implements Runnable {

	//static ArrayList<String> al = new ArrayList<>();
	static CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Child thread updating...");
			al.add("D");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public static void main(String[] args) {
		al.add("A");
		al.add("B");
		al.add("C");
		
		// Create Thread and start
		ConcurrentDemo cd = new ConcurrentDemo();
		Thread t = new Thread(cd);
		t.start();
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Iterating arrayList and current ele is: " );
			System.out.println(itr.next());
			//itr.remove();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
