package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Message;
import com.revature.models.User;

@Controller("sessionManagementController")
@CrossOrigin(origins = {"*","http://localhost:4444"}, allowCredentials = "true")
/*
 * If you don't add "http://" at the start of your request URIs in Angular, then you can STILL get CORS issues. 
 */
public class SessionController {
	
	/*
	 * Component vs Service vs Repository vs Controllers 
	 * 
	 * In our scope there is no real difference between all of them except controllwers. 
	 * 
	 * Service and componetns have no real difference, more of a label 
	 * 
	 * repository vs component, for our scope, also more of a label 
	 * 
	 * Controller will indicate that this class is excpected to be mapped to a url 
	 */
	
	@GetMapping(value = "/hello", produces="application/json")
	public @ResponseBody Message hello() {
		return new Message("Hello There!");
	}
	
	@GetMapping(value = "/login")
	public @ResponseBody Message login(HttpServletRequest req) {
		
		HttpSession session = req.getSession(); 
		
		User incomingUser = new User("Bobby", true);
		
		session.setAttribute("loggedInUser", incomingUser);
		
		return new Message("You've successfully logged in");
	}
	
	@GetMapping(value = "/getInfo", produces = "application/json")
	public @ResponseBody User getLoggedInUser(HttpSession session) {
		User currentUser;
		
		currentUser = (User) session.getAttribute("loggedInUser");
		
		if(currentUser == null) {
			/*
			 * If the user is null, I'll give them a fake user/profile
			 */
			currentUser = new User("Fakey fake", false);
		}else if( currentUser != null && currentUser.getName().equals("Fakey fake")) {
			currentUser = new User("Stop hacking", false);
		}
		
		return currentUser;
		
	}
	
	@GetMapping(value = "/logout")
	public @ResponseBody Message logout(HttpSession session) {
		
		session.invalidate();
		
		return new Message("You've successfully logged out!");
	}

}
