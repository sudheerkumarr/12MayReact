package day11;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		} // for

	}// run

}// MyThread2

class MyThread3 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		
		// Step1 - Create Objects for MyThread class
		MyThread2 mt1 = new MyThread2();
		MyThread3 mt2 = new MyThread3();
		
		// Step2 - Create threads
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		// Step3 - start thread
		t1.start();
		t2.start();
		
		for(int i=0; i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
