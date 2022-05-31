package day11;

class Counter{
	int count; // 0
	
	synchronized void incr(int num) {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(count+=num); 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class MyThread4 extends Thread {
	Counter c;
	
	// Constructor
	MyThread4(Counter c) {
		this.c = c;
	}
	
	public void run() {
		c.incr(5);
	}
}

class MyThread5 extends Thread {
    Counter c;
	
	MyThread5(Counter c) {
		this.c = c;
	}
	
	public void run() {
		c.incr(10);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// Creating Counter Object
		Counter c = new Counter();
		
		
		// create threads 
		MyThread4 t1 = new MyThread4(c);
		MyThread5 t2 = new MyThread5(c);
		
		
		// start thread
		t1.start();
		t2.start();

	}

}
