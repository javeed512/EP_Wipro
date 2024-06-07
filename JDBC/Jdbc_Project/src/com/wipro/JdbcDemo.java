package com.wipro;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {

			// step1 register driver class
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// get the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "admin");

			// create statement and execute query

				conn.setAutoCommit(false);
			
			Statement stmt = conn.createStatement();

			 String insert = "insert into customer values(106,'jerry','2001-01-01',4000)";

			 int count = stmt.executeUpdate(insert);
			 
			 
			 conn.commit();
			 
			// conn.rollback();
			/*
			 * Savepoint s1 = conn.setSavepoint("s1"); conn.releaseSavepoint(s1);
			 */

			// System.out.println(count + " record affected");

			String selectQuery = "select * from customer";

			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {

				int cid = rs.getInt("cid");
				String cname = rs.getString("cname");
				Date dob = rs.getDate("dob");
				double amount = rs.getDouble("amount");

				System.out.println(cid + " " + cname + " " + dob + " " + amount);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
