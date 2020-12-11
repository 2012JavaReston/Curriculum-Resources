package com.example.diamond.problem;

public class DogCat implements Cat, Dog {
	
	/*
	 * Diamon problem comes from the fact that there is 2 implementations of a method. 
	 * 	And we don't know which to pick. 
	 * 
	 * This is introduced due to the "default" keyword which allows us to create concrete methods
	 * 	and the fact that mulitple interfaces can be extended by other classes or interfaces. 
	 * 
	 * We resolve this by overriding the method and using the super keword with out parent interface!
	 */

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		Dog.super.makeSound(); // Specify what parent we want 
		Cat.super.makeSound(); 
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
