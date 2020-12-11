package com.revature;

public class MainDriver {
	
	/*
	 * Within a single application multiple process can be running simultaneously. 
	 * Each process is executed by a thread. 
	 * 
	 * Thread: 
	 * 		For Java, a thread is a singular unit of processing. It allows a processer to execute 
	 * 		multiple threads of execution. All threads on the same core can share the resource of the 
	 * 		core. (e.g. cache memory)
	 * 
	 * Daemon Thread
	 * 		Always running the background. Only stops when the app stops. (e.g. Garbage Collector).
	 * 
	 * Advantages: 
	 * 		Users are not blocked when performing actions. BAckground processes won;t affect user threads. 
	 * 		If the thread meets an exception, other threads won't be affected. 
	 * 
	 * Disadvantages:
	 * 		More overhead, due to communication between threads
	 * 		synchronisation issues 
	 * 	
	 */
	
	public static void main(String... args) {
		
		/*
		 * States of a thread:
		 * 
		 * New -> Runnable -> Running -> Waiting ->Dead
		 * 
		 * New:
		 * 	The thread is instantiated (Using Thread class or Runnable interface)
		 * 
		 * Runnable:
		 * 	The start() method has been invoked but the scheduler has not selected it to start 
		 * 		running the thread. 
		 * 
		 * Running:
		 * 	The thread is in running state (scheduler has selected it)
		 * 
		 * Waiting, Timed waiting, Blocked:
		 * 	The thread is alive but not currently running. 
		 * 	Waiting: Thread is waiting for an event to occur
		 * 	Timed waiting: wiating a specified amount of time. 
		 * 	Blocked: Thread is unable to access a resource because another thread is currently using it. 
		 * 
		 * Dead
		 * 	Thread has been terminated. 
		 * 
		 */
		
		Thread t = new CustomThread();
		t.start(); //When we invoke a thread's start, that creates a new thread that is running
					// concureently with the Main thread!

		//		t.run(); //When we invoke it directly, this is the Main thread running the method
		
		
		Runnable r = () -> {
			while(true) {
				System.out.println("I'm running!");
			}
		};
		
//		r.run();
		
		Runnable r2 = () -> {
			while(true) {
				System.out.println(" IM RUNNING AGAIN!");
			}
		};
		
		Thread tr = new Thread(r2);
		tr.start();//When we invoke a thread's start, that creates a new thread that is running
		// concureently with the Main thread!
		
		
	}

}
