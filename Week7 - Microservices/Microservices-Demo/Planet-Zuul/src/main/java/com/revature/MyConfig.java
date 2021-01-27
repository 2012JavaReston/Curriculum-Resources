package com.revature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.filters.MyFilter;

/*
 * So far we've used a bit of xml and annotation based configuration. 
 * 
 * We're introducing Java based configuration. 
 * 
 * By specifiying the following class to be @Configuration, Spring will understand that this is to be a class
 * that wil generate bean definitions. 
 * 
 */

@Configuration
public class MyConfig {
	
	@Bean
	public MyFilter stuff() {
		return new MyFilter();
	}

}
