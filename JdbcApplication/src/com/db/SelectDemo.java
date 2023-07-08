package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

		try {

			// step1 register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 get the db connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mlr_db", "root", "admin");

			Statement stmt = conn.createStatement();

			String selectQuery = "select * from dept";

			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {

				int dno = rs.getInt("Dno");
				String dname = rs.getString("Dname");
				String loc = rs.getString("Location");
				
				
				
				System.out.println(dno +" "+dname+" "+loc);
				
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
