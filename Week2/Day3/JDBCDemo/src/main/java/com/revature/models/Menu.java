package com.revature.models;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Menu
	{
		public static final Map<String, Double> _menu = Stream.of(new Object[][] { 
			     { "Burger", 2.50 }, 
			     { "Chicken", 2.00 },
			     { "Fries", 1.50 },
			     { "Drink", 1.00 },
			 }).collect(Collectors.toMap(data -> (String) data[0], data -> (Double) data[1]));
	}
