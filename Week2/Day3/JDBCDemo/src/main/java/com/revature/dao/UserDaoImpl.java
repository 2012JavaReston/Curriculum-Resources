package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.User;
import com.revature.util.ConnectionCafeFactory;

public class UserDaoImpl implements UserDao{

	@Override
	public void insertUser(User c) {
		String sql = "INSERT INTO users(name, email, number_of_orders, is_employee) values"
				+ "(?,?,?,?);";
		
		try (Connection conn = ConnectionCafeFactory.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail());
			ps.setInt(3, c.getOrder());
			ps.setBoolean(4, c.isEmployee());
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User selectUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectMvps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User c) {
		// TODO Auto-generated method stub
		
	}


}
