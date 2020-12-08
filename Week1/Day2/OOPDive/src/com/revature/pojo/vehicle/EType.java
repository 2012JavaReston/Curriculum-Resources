package com.revature.pojo.vehicle;

public class EType extends Jaguar{ //Classes can only at most inherit from one class!
	
	//We can only extend one because if classes have the same method signature, but with different implementations then Java gets confused. 

//	public EType(double price) {
//		super();
//	}
	
	/*
	 * By the JVM:
	 * 		public EType(){
	 * 			super();
	 * 		}
	 */

	public EType(double price, int seats) {
		super(price, seats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heatedSeats() {
		// TODO Auto-generated method stub
		
	}

}
