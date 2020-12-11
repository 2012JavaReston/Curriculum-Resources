package com.revature;

public class CustomThread extends Thread {
	
	@Override 
	public void start() {
		super.start();
		System.out.println("Hello There, I'm starting up!");
	}
	
	@Override 
	public void run() {
		while(true) {
			
		
		System.out.println("Hello, I'm running in custom thread!!");
		}
	}

}
