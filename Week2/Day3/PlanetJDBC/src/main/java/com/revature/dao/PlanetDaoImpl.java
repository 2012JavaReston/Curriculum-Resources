package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDao {

	@Override
	public void insertPlanet(Planet p) {
		Connection conn = ConnectionFactory.getConnection();
//		
		//THIS WAY IS TERRIBLE, 
		// 1) working with a lot of quotes
		// 2) Can lead to SQL injection 
		// 		What happens when you insert a user called Johnny drop table;
//		//This is our SQL query
//		String sql = "INSERT INTO planets (planet_name, planet_description, rings) values"
//				+ "('" +p.getName()+ "','" +p.getDescription() +"','" + p.isRings() + "');";
//		
//		
//		
//		try {
//			//We want to pass this statement through 
//			Statement s = conn.createStatement();
//			
//			//execute said query
//			s.execute(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//We're going to use PreparedStatement
		
		String sql = "INSERT INTO planets (planet_name, planet_description, rings,number_of_moons) values" 
					+ "(?,?,?,?);";
		
		try {
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setString(2, p.getDescription());
			ps.setBoolean(3, p.isRings());
			ps.setInt(4, p.getMoons());
			
			ps.execute();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

	}

	@Override
	public Planet selectPlanetByName(String name) {
		
		List<Planet> planets = new ArrayList<>(); 
		//I might not have a uniqu constraint, so be prepared for multiple entities 
		
		//Will close the connection once we're out of the try catch block
		try(Connection conn = ConnectionFactory.getConnection()){
			
			//We're still levaraging prepared statement 
			String sql = "SELECT * FROM planets WHERE planet_name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			//We expect information back, unlike in an insert statement 
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				planets.add(new Planet(
						rs.getInt("planet_id"),
						rs.getString(2),
						rs.getString(3),
						rs.getBoolean("rings"),
						rs.getInt("number_of_moons")));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return planets.get(0);
	}

	@Override
	public List<Planet> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planet> selectRingedPlanets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePlanet(Planet p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlanet(Planet p) {
		// TODO Auto-generated method stub

	}

}
