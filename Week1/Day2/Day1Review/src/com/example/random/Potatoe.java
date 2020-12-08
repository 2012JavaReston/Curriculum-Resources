package com.example.random;

import com.example.pojo.Human;

public class Potatoe extends Human{
	
	//Inheritance is an IS-A relationship. 
	
//	Object -> Human -> Potatoe
	
	public void randoMethod() {
		System.out.println(this.height); //accessible because it's protected and we're in a child class 
//		System.out.println(this.name); // (default), only belongs to the class 
		System.out.println(this.sSN); // public, so we have access everywhere
//		System.out.println(this.weight);// priavte this is only available to classes in the same package

		this.exercise();
	}

}
