package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.everything.ProxyApp;

public class MainDriver {
	
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		
		ProxyApp app = appContext.getBean("ProxyApp",ProxyApp.class);
		
		OtherProxyApp otherApp = appContext.getBean("BackUpApp",OtherProxyApp.class);
		
		otherApp.playUkelele();
		
		app.launchingToTheMoon(100);
		app.moonWalking();
		app.moonWalking();
		app.moonWalking();
		app.moonWalking();
		app.moonWalking();
		app.marsWalking();
		app.playGuitar("The Big Red and Green Guitar");
		app.playingHockey(12, 12);
		
		
	}

}
