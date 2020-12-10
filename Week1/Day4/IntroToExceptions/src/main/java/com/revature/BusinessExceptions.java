package com.revature;

public class BusinessExceptions extends Exception{
	
	private String personalMessage;
	
	
	
	public BusinessExceptions(String personalMessage) {
		super();
		this.personalMessage = personalMessage;
	}



	@Override
	public void printStackTrace() {
		super.printStackTrace();
		
		System.out.println(this.personalMessage);
	}
	

}
