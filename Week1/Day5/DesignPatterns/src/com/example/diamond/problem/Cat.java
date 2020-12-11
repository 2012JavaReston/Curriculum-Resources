package com.example.diamond.problem;

public interface Cat extends Animal{
	
	public default void makeSound() {
		System.out.println("Meow");
	}

}
