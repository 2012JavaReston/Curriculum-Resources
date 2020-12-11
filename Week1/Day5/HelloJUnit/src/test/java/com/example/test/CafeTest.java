package com.example.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.example.Cafe;
import com.example.Kitchen;
import com.example.model.Food;

public class CafeTest {
	
	static Cafe c;
	
	@Mock
	static Kitchen k;
	
	@Before
	public void setUp() {
		
		c = new Cafe(); //We're actually testing cafe, so we don't want to create a perfect mock!
		
		k = Mockito.mock(Kitchen.class); // Mockito knows to handle it
		
		//We are mocking the kitchen, so when we invoke the cook method Mockito will then return the food!
		Mockito.when(k.cook()).thenReturn(new Food());
		
		
	}
	
	

	@Test
	public void testDelivery() {

		assertTrue(c.deliverFood(k));
		
	}

}
