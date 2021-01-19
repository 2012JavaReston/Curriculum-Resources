package com.revature.security;

import org.springframework.stereotype.Component;

@Component("AuthLayerDemo")
public class AuthLayer {
	
	public boolean checkUser() {
		return true;
	}

}
