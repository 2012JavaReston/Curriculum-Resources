package com.revature.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("dev") //This component will only run, when the spring.profile.active = dev. 
//You can have something called @ActiveProfile, this will modify the profile based on the applicaitonContext that is used. 
public class DevController {
	
	@Value("${message: Inside Dev}")
	public String devMessage;
	
	@GetMapping("/devMode")
	public String devStuff() {
		return devMessage;
	}

}
