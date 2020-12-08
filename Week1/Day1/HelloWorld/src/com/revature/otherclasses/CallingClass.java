package com.revature.otherclasses;

import com.revature.*;
import a.b.c.d.e.*;
import com.revature.classes.BasicClass; // import <package-strcture>.<Mclass-name we want to import> 

public class CallingClass {
	
	public static void main(String[] args) {
		
		//declaring a variable (stores primitives)
		int myInt = 1;
		
		//declaring a reference variable 
		// "new" means that an instance of the class has been created. 
		
		BasicClass myObject = new BasicClass();
		BasicClass myObject2 = new BasicClass();
		BasicClass myObject3 = myObject;
		
		myObject.doubly = 42.0;
		myObject3.goodWeather = false;
		
//		System.out.println(myObject.doubly);
//		System.out.println(myObject2.doubly);
//		System.out.println(myObject3.doubly);
		
//		System.out.println(myObject.goodWeather);
		
		
//		BasicClass , the method does not belong to the class. We need to have the instance of the class. 
		
//		myClass.bark();
//		
//		System.out.println(myClass.fetch());
//	
//		System.out.println(myClass.goodWeather);
//		System.out.println(myClass.intNumber);
		
		
		
		//Pass by value and pass by reference 
		//This is a variable. the variable stores the information itself. 
		//THIS IS PASS BY VALUE 
		int myInty = 1;
		int myInty2 = myInty;
		
		myInty2 = 35;
		
//		System.out.println(myInty);
		
		//PASS BY REFERENCE
		// Objects are passed be reference.
		//Type and the variable name 
		BasicClass myobj = new BasicClass();
		BasicClass myobj2 = myobj;
		
		myobj2.doubly = 101.0;
//		System.out.println(myobj.doubly);
		
		
		
		
		
		
		// Playing around with our Planet class
		
		Planet p = new Planet("Pluto", false,1);
		Planet p2 = new Planet("Jupiter", true, 1000);
		
		Planet p3 = p2;
		
		p.orbit("randomString",2.0);
		
//		orbit(); // we need a reference
//		Planet.orbit()// We need an object that can do it for us. 
		
		System.out.println(p.mass);
		
		// Playing around with our Moon object
		
		Moon m = new Moon("The Moon", false, 0.3, "Earth");
		
		m.myPlanet = "Mars";
		
		m.orbit("apples", 1.2);
		m.crash(p.name , p2.name);
		
//		
	}

}
