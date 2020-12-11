package com.example;

import com.example.model.Food;

public class Cafe {
	
	public boolean deliverFood(Kitchen k) {

		Boolean success = false;
		
		Food f = k.cook();
		
		if(f == null) {
			success = false;
		}else if( f != null){
			success = true;
			System.out.println("Food delivered ");
		}
		
		return success;
		
	}

}
