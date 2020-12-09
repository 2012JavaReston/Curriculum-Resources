package com.example.repo;

import com.example.models.Drink;
import com.example.models.Food;
import com.example.models.MenuItems;

public class KitchenStorage {
	
	//Will contain all the instances of my models 
	//This will also be the place I grab persisted data; database or file
	
	private MenuItems[] listOfMenus = new MenuItems[2];

	public KitchenStorage() {
		super();
		
		listOfMenus[0] = new Food("cake",2,300,false);
		listOfMenus[1] = new Drink("coffee",2,300,1);
		// TODO Auto-generated constructor stub
	}
	
	//I'm hardcoding in all the infromation 
	
	public MenuItems[] getAllTheMenuItems() {
		return this.listOfMenus;
	}
	
	public MenuItems[] getAllDrinks() {
		return null;
	}
	
	

}
