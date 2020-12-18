package com.revature.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.User;

import java.util.List;

import com.revature.models.User;

public interface UserDao {
	
	//Should have CRUD operations
	
	//INSERT
	public void insertUser(User c);
	
	//SELECT statements
	public User selectUserByName(String name);
	public List<User> selectAllUser();	
	public List<User> selectMvps();
	
	//UPDATE
	public void updateUser(User u, User newU);

	//DELETE
	public Boolean deleteUser(String u);
	

}
