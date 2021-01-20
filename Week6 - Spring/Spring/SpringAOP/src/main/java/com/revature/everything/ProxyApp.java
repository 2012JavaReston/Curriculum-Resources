package com.revature.everything;

import org.springframework.stereotype.Component;

@Component("ProxyApp")
public class ProxyApp {
	
	/*
	 * Cross Cutting Concerns:
	 * 		CCC is meta logic that an application needs, that is independent to the business logic. 
	 * 		In other words, logic that EVERY application needs, even before you consider specific business logic. 
	 * 
	 * 
	 * Examples?
	 * 		Logging
	 * 		Secuirty 
	 * 		Caching
	 * 		Exceptions
	 * 		Transactions
	 */
	
	
	public ProxyApp() {
		
	}
	
	public void moonWalking() {
		
		//sercurity checking - makes sure they have access - 4
		//exception handling, just in case if something goes wrong -2
		
		System.out.println("Walking on the Moon and playing guitar!");
		
		//logging - 4 lines of logging. - 4
		//caching - few lines of caching here - 2
	}
	
	public void marsWalking() {
		
		//sercurity checking - makes sure they have access - 4
		//exception handling, just in case if something goes wrong -2
		
		System.out.println("Walking on Mars and playing ukelele!");
		
		//logging - 4 lines of logging. - 4
		//caching - few lines of caching here - 2
	}
	
	public Boolean playGuitar(String guitar) {
		
		//sercurityChecking()
		//exception handling()
				
		
		System.out.println("playing the guitar!");
		boolean guitarSpecial = true;
		
		//logging()
		//caching()
		
		return guitarSpecial;
	}
	
	public Integer playingHockey(int players, int sticks) {
		
		System.out.println("Sliding around playing hockey");
		return 0;
	}
	
	public Integer launchingToTheMoon(double fuel) {
		
		System.out.println("Thanks Elon");
		return 0;
	}
	
	/*
	 * ASPECT?
	 * 
	 * ADVICE?
	 * 
	 * POINTCUT EXPRESSION?
	 * 
	 * JOINPOINT?
	 * 
	 * CROSS CUTTING CONCERN? 
	 * 
	 */

}
