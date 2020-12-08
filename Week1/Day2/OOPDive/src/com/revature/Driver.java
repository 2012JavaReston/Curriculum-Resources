package com.revature;

import com.revature.pojo.Animal;
import com.revature.pojo.Athlete;
import com.revature.pojo.CouchPotatoe;
import com.revature.pojo.Human;
import com.revature.pojo.SuperHero;
import com.revature.pojo.vehicle.Car;
import com.revature.pojo.vehicle.EType;
import com.revature.pojo.vehicle.Ferrari;
import com.revature.pojo.vehicle.Jaguar;
import com.revature.pojo.vehicle.Volvo;

public class Driver {
	
	
	public static void raceTrack(Car c) {
		
		c.accelerate();
		c.brake();
		
	}
	
	public static void main(String[] oranges) {
		
		Human[] theOffice = new Human[4];
		
		CouchPotatoe terry = new CouchPotatoe();
		Human jerry = new Human();
		Human lenny = new Athlete();
		Human Kent = new SuperHero();
		
		theOffice[0] = terry; //implicitly cast into human 
		theOffice[1] = lenny;
		
		terry.lazeAbout();
		((CouchPotatoe) theOffice[0]).lazeAbout();
//		((CouchPotatoe) theOffice[1]).lazeAbout();// lenny ain't a laze about!
		
		
		Human h1 = new Human();
		//Humans will not have access to athlete methods or variables
		//Athletes can have access to humans methods or variables. 
		
//		h1.jumpAHurdle();
//		
//		Athlete a1 = new Athlete();
//		a1.jumpAHurdle();
//		a1.run();
//		a1.superJump();
		
		
		
		Human h2 = new Athlete();
		
		//We've create a variable of dataype Human, but we've levaraged a child constructor
		
		
//		h2.jumpAHurdle(); // When we instantiate a object with a child class, if it already access to variables and methods, 
//							// it will use the child implementation of it. 
//		h2.run();
//		h2.superJump(); //Still no acccess to child methods
		
		
		Animal a2 = new Athlete();
		
		a2.jumpAHurdle();
		a2.run();
		((Human) a2).doDeskWork(); //we are casting from ANimal to human !
		((Athlete) a2).superJump();
		
		
		Animal a3 = new Human();
		
		a3.jumpAHurdle();
		a3.run();
		((Human) a3).doDeskWork(); //we are casting from ANimal to human !
//		((Athlete) a3).superJump();
		
		Animal a4 = new Animal();
		
//		((Human) a4).doDeskWork();

//		Human ath1 = (Human) new Animal(); //downcasting
		
		
		
		
		Human h = new Human();
//		h.fly();
//		((SuperHero) h).fly();
		
		Human clarkKent = new SuperHero();
		((SuperHero) clarkKent).fly();
		
//		SuperHero batman = (SuperHero) new Human();
		
		
		//------------------------------------ABSTRACTION-------------------------------//
		
		Car car = new Volvo(); //Interaces don't have constructors. 
		
//		car.accelerate();
		
		Car fastCar = new Ferrari();
		
//		fastCar.accelerate();
		
		Jaguar luxuryCar = new EType(0,0); // Even though it's an abstract class with a constructor, Jaguar has 3 unimplemented methods 
										// so Java ain't going to allow that.
		
		
		
		raceTrack(car);
		raceTrack(fastCar);
		raceTrack((Car) luxuryCar);
		
		
		
		
		
		
	}

}
