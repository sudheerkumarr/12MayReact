package day11;

/*
 *  * Multi Threading
 * Multitasking - Executing more than one task 
 *  Multi processing - OS
 *   each process will have its own memory
 *   Communication between process is expensive
 *   Ex: notepad, word , mp3 player, browser
 *   
 *  Multi threading
 *   Java Supports multi threading only
 *   uses shared memory
 *   Threads are part of Process
 *   Communication between thread is cheap
 *   Gaming applications/Animations
 *   
 *  Ways To create multithreading
 *   1. Implementing Runnable Interface
 *   2. Extending Thread class
 *   
 *  Which method requires override
 *   run()
 *  start() - start thread
 *  priority - MAX,MIN,NORMAL
 *           - 0-10 - range
 *           - 5 - default
 *  Number of thread created by default - main thread
 *  Name of main thread - main
 *  
 *  Lifecycles of a Thread
 *  New
 *  Runnable
 *  Running
 *  Blocked/Waiting
 *  Terminated
 *  
 *  
 *  interface IntfA {
 *    void m1();
 *  }
 *  interface IntfB {
 *  	void m1();
 *  }
 *  interface IntfC {
 *  	void m1();
 *  }
 *  
 *  class ClassA implements IntfA, IntfB, IntfC {
 *  
 *  	void m1() {
 *          System.out.println("ClassA implementation");
 *      } 
 *  }
 *  
 *  class ClassB {
 *     void m1() {
 *        System.out.println("ClassB implementation")
 *     }
 *  }
 *  class ClassC {
 *  	void m1() {
 *        System.out.println("ClassC implementation")
 *     }
 *  }
 *  class ClassD extends ClassB, ClassC{} // Multiple Inheritance - won't support
 *  
 *  class ClassE extends Thread, ClassC {} // invalid
 *  
 *  class ClassF implements Runnable, IntfA, IntfB extends ClassC {} // valid
 *  
 *  interface IntfD extends IntfC, IntfB {}
 *  
 *  - Overriding Thread class start() method won't register thread with thread scheduler and call run() method
 *  - Thread class run() method won't return anything.
 */

interface IntfA {}
interface IntfB {}
interface IntfC extends IntfA, IntfB {}

class ClassA {}
class ClassB {}
class ClassC extends ClassA{}
//class ClassD extends ClassA, ClassB{} ;// invalid

class ClassD extends ClassA implements IntfA, IntfB, IntfC {}

//Option 1- extending Thread class
class MyThread extends Thread {
	public void  run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
//			try {
//				//Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
//	public void start() {
//		System.out.println("MyThread class start method");
//	}

}

public class MultiThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	
		// Get active thread count
		System.out.println(Thread.currentThread().activeCount()); // 1
		
		// Step1 - crate obj of thread class
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		
		// Set thread name
		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		
		// Priority - range - 1-10; default - 5 
		System.out.println();
		System.out.println(Thread.currentThread().getPriority());//5
		System.out.println(t1.getPriority()); // 5
		System.out.println(t2.getPriority()); // 5
		
		 //Update thread priority
		Thread.currentThread().setPriority(10); // highest priority
		t1.setPriority(6);
		t2.setPriority(2);
		
		System.out.println();
		System.out.println(Thread.currentThread().getPriority());//10
		System.out.println(t1.getPriority()); // 6
		System.out.println(t2.getPriority()); //2
		
		// Option 2 - set priority to threads
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		System.out.println();
		System.out.println("main thread: "+Thread.currentThread().getPriority());//5
		System.out.println("T1 thread: "+t1.getPriority()); // 10
		System.out.println("T2 thread: "+t2.getPriority()); // 1
		System.out.println();
		
		
		// Step 2 - start thread
		t1.start(); // thread register with Thread Scheduler and calls run method
		t2.start();
		
		System.out.println();
		// get active number of threads
		System.out.println(Thread.currentThread().activeCount());//3 - main, Thread-0 and Thread-1
		
		
		// main thread waits until t1 and t2 execution gets completed
		t1.join();
		t2.join();
		
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()); // main
			//Thread.sleep(1000);
		}
		
		// get active number of threads
		System.out.println(Thread.currentThread().activeCount()); // 1 - main

		//Thread.yield(); // wait, notify(), notifyAll()
		//join()
	
	}

}
