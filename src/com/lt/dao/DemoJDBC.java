package com.lt.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;

public class DemoJDBC {

	/**
	 * @param args
	 */
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test"; // Database
																// credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Step 3 Regiater Driver here and create connection
			Class.forName("com.mysql.jdbc.Driver"); // Step 4 make/open a
													// connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			String sql = "insert into employee values(?,?,?,?)";
			// String sql = "UPDATE Employees set age=? WHERE id=?";
			// String sql1="delete from employee where id=?";
			// stmt.setInt(1, 101);
			stmt = conn.prepareStatement(sql);
			// Hard coded data
			int id = 628;
			String name = "Rubin";
			String address = "Kottayam";
			String location = "india";
			// Bind values into the parameters.
			stmt.setInt(1, id); // This would set age
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setString(4, location);
			stmt.executeUpdate();
			// Let us update age of the record with ID = 102;
			// int rows = stmt.executeUpdate();
			// system.out.println("Rows impacted : " + rows ); // Let us select
			// all the records and display them.
			sql = "SELECT id, name ,address, location FROM employee";
			ResultSet rs = stmt.executeQuery(sql); // STEP 5: Extract data from
													// result set
			while (rs.next()) {
				// Retrieve by column name
				int eid = rs.getInt("id");
				String name1 = rs.getString("name");
				String address1 = rs.getString("address");
				String location1 = rs.getString("location"); // Display values
				System.out.print("ID: " + eid);
				System.out.print(", Name: " + name1);
				System.out.print(", Address : " + address1);
				System.out.println(", Location : " + location1);

			}

			// STEP 6: Clean-up environment
			// rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null)
					stmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
			try {
				if(conn!=null)
					stmt.close();
			} catch (SQLException se2) {
				// TODO: handle exception
			}
		}
		System.out.println("GoodBye");

	}

}
