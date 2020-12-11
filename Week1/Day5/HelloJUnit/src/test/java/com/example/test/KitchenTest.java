package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.Kitchen;

public class KitchenTest {

	@Test
	public void testCook() {
		Kitchen k = new Kitchen();
		assertNotNull(k.cook());
	}

}
