package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {
	
	/*
	 * Why do we Test in the first place? 
	 * 		Testing allows us to have checks to ensure that our code is working. We can create automated tests, so 
	 * 		that during a development lifecycle we can check our code regularly without hindering the flow.
	 * 		An example of tets are unit testing, and integration testing. 
	 * 
	 * What is Unit Testing?
	 * 		Testing a functionality of a given function. We test by checking that the expected behaviour is the same
	 * 		as the actual behaviour. 
	 * 
	 * 		Unit Testing involves testing the smallest unit of code we can. In Java, the smallest unit of code we can 
	 * 		test is Methods. We will be levaraging JUnit.
	 * 
	 * What is JUnit?
	 * 		JUnit is a testing framework. It provides us with methods that makes our lives easier. 
	 */

	//We need to provide metadata to the JVM to tell it, that the following method is a testing method. 
	
	static Calculator calc;
	
	@BeforeClass //It's invoked before the instance is created 
	public static void setUpToSetUp() {
		calc = new Calculator();
		System.out.println("Set up!");
		
	}
	
	@Before
	public void setup() {
		calc = new Calculator();
		System.out.println("Calculator set up!");
	}
	
	@After
	public void reset() {
		calc = new Calculator();
		System.out.println("Resetting calculator");
	}
	
	@AfterClass
	public static void allDone() {
		
	}
	
	
	@Test 
	public void testSingleAdd() {
		
		
		//In my first add method, it should return the exact value that I pass in!
		
		assertEquals(2, calc.add(2) ); //We're checking that it returns the value 
		
	}
	
	@Test
	public void testDoubleAdd() {
		
		assertEquals(5, calc.add(2, 3));
	}
	
	@Test
	public void testMagic() throws InterruptedException {
		
		assertFalse(calc.magic); //Want to ensure my magic is not on
		
		calc.turnOnMagic(); //invoking the method!
		
		assertTrue(calc.magic); // Check that the magic is on now!
		
	}
	
	@Test
	public void testMagicFalse() throws InterruptedException {
		
		assertFalse(calc.magic); //Want to ensure my magic is not on
		
		calc.turnOffMagic(); //invoking the method!
		
		assertFalse(calc.magic); // Check that the magic is on now!
		
	}
	
	@Test(expected=IllegalAccessError.class)
	public void troublesomeTest() {
		
		calc.troublesome();
	}

}
