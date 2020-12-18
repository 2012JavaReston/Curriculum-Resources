package com.revature;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;
import com.revature.service.Cafe;

import io.github.cdimascio.dotenv.Dotenv;

public class Driver {
	
	private static Cafe cF = new Cafe();

	static Dotenv dotenv = Dotenv.load();
	
	

	public static void main(String[] args) {
		
		System.out.println(dotenv.get("DB_URL"));
		
//		uDao.insertUser(new User(0,"bob","bob",10,true));
//		UserDao uDao = new UserDaoImpl();
//		cF.createNewUser();
		System.out.println(cF.getAllUsers()); 
		cF.deleteUser();
//		System.out.println(uDao.selectAllUser()); 
//		System.out.println(uDao.selectAllUser()); 
		
		
		
	}

	
}
