package com.example.models;

public class MenuItems {
	
	private String name;
	private double calories;
	private double price;
	
	
	
	public MenuItems(String name, double calories, double price) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	public MenuItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItems [name=" + name + ", calories=" + calories + ", price=" + price + "]";
	}
	
	

}
