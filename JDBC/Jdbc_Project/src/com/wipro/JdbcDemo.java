package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		try {

			// step1 register driver class
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// get the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");

			// create statement and execute query

			Statement stmt = conn.createStatement();

			String insert = "insert into customer values(101,'king','2001-01-01',5000)";

			int count = stmt.executeUpdate(insert);

			System.out.println(count + " record affected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
