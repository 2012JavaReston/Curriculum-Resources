package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDao {

	@Override
	public void insertPlanetStatement(Planet p) {
		Connection conn = ConnectionFactory.getConnection();
		
//		THIS WAY IS TERRIBLE, 
//		 Can lead to SQL injection 
//		 		What happens when you insert a user called Johnny drop table?
//				(Use prepared statements)
		//This is our SQL query
		String sql = "INSERT INTO planets (planet_name, planet_description, rings) values"
				+ "('" +p.getName()+ "','" +p.getDescription() +"','" + p.isRings() + "');";
		
		
		
		try {
			//We want to pass this statement through 
			Statement s = conn.createStatement();
			
			//execute said query
			s.execute(sql);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//We're going to use PreparedStatement

	}
	
	@Override
	public void insertPlanetPreparedStatement(Planet p) {
		//For prepared statements, we create strings with placeholders '?'
		String sql = "INSERT INTO planets (planet_name, planet_description, rings,number_of_moons) values" 
				+ "(?,?,?,?);";
	
	try (Connection conn = ConnectionFactory.getConnection()){

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
	public void insertPlanetProcedure(Planet p) {
		
		String callableSql = "CALL insert_into_planets(?,?,?)";
		
		//try-with-resources will automatically close our connection when down with the try catch block
		try (Connection conn = ConnectionFactory.getConnection()){
			//We use callablestatements to invoke procedures in our datbase.
			CallableStatement cs = conn.prepareCall(callableSql);
			cs.setString(1, p.getName());
			cs.setString(2, p.getDescription());
			cs.setBoolean(3, p.isRings());
			
			cs.execute();
			
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
	public List<Planet> selectAllPlanets() {
		List<Planet> planets = new ArrayList<>();
		
		String sql = " SELECT * FROM planets" ; //sql statement 
		
		try (Connection conn = ConnectionFactory.getConnection()){
			//This time, I'm using a Statement
			//BUT
			//I'm not passing in any user parameters though, just a static string...so no risk of SQL injection. 
			//A prepared statement would also do the same job as well. 
			Statement s = conn.createStatement(); //Allows us to send SQL statements
			
			
			ResultSet rs = s.executeQuery(sql); //We are executing our SQL statement
			
			while(rs.next()) {
				planets.add(new Planet(
				rs.getInt("planet_id"),
				rs.getString("planet_name"),
				rs.getString(3),
				rs.getBoolean(4),
				rs.getInt("number_of_moons")
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return planets;
	}

	@Override
	public List<Planet> selectRingedPlanets() {
		//Can't give away all my secrets...
		return null;
	}

	@Override
	public void updatePlanet(Planet p) {
		//This is a specific version of update
		// I'm referencing the record by it's id and updating everything but the id.
		//In your case, you might decide that it should not be possible to change the name or the rings
		//You can create update methods that only update one feature at a time
		// e.g. updatePlanetName or updatePlanetDescription
		
			try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "UPDATE planets SET planet_name = ?, planet_description = ?, rings = ?, number_of_moons = ? WHERE planet_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setString(2, p.getDescription());
			ps.setBoolean(3, p.isRings());
			ps.setInt(4, p.getMoons());
			ps.setInt(5, p.getId());
			
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deletePlanet(Planet p) {
		
		Connection conn = ConnectionFactory.getConnection();
		
		//I'm deleting planet based on it's ID
		//You might change it to delete by planet_name. 
		String sql = "DELETE FROM planets where planet_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
