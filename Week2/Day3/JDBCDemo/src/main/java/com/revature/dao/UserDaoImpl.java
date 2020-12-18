package com.revature.dao;

import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public User selectUserByName(String name) {
		String sql = "SELECT * FROM users WHERE name='" + name + "';";
		User entity = null;
		try (Connection conn = ConnectionCafeFactory.getConnection()){
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			entity = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5));
		} catch (Exception e)
			{
				e.printStackTrace();
			}
		return entity;
	}

	@Override
	public List<User> selectAllUser() {
		String sql = "SELECT * FROM users;";
		List<User> allUsers = new ArrayList<>();
		try (Connection conn = ConnectionCafeFactory.getConnection()){
		
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				allUsers.add(new User(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5)));
			}
			
//			rs.close();
//			ps.close();

		} catch (Exception e){
			e.printStackTrace();
		}
		return allUsers;
	}
	
	@Override
	public List<User> selectMvps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User u, User newU) {
//		String name = u.getName();
//		String email = u.getEmail();
//		Boolean emp = u.isEmployee();
//		String sql = "UPDATE users SET('name','email',is_employee') WHERE
	}

	@Override
	public Boolean deleteUser(String u) {
		String sql = "DELETE FROM users WHERE name = ? ;";
		Boolean success = false;
		List<User> users = selectAllUser();
		int startingCount = users.size();
		try (Connection conn = ConnectionCafeFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u);
			ps.execute();
			users = selectAllUser();
			if (users.size()<startingCount) {
				success=true;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return success;
		
	}


}
