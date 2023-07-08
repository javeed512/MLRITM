package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		// step1 register driver

		try {

			// step1 register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 get the db connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mlr_db", "root", "admin");

			System.out.println(conn);

			// step3 create statement

			Statement stmt = conn.createStatement();
			//String insertQuery = "insert into dept value(60,'Training','Mysore')";

			//String updateQuery = "update dept set location='noida' where dno = 60 ";
			
			String deleteQuery = "delete from dept where dno = 60";
			
			int n = stmt.executeUpdate(deleteQuery);

			System.out.println(n + " record affected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
