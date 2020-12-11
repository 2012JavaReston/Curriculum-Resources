package com.example.diamond.problem;

public interface Dog extends Animal{
	
	public default void makeSound() {
		System.out.println("Woof!");
	}

}
