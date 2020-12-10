package com.revature.comparing;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Planet>{

	@Override
	public int compare(Planet arg0, Planet arg1) {
		
		//I'm goint to take advantage of th ToComapre method in Strings 
		
		return arg0.getName().compareTo(arg1.getName());
	}

}
