package com.chanpreet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCExample {

	/*
	 * To run this prog add the suitable jar to class path 
	 * I have used the database named 'javaPrac'
	 * the database has one table named 'table1' with 2 columns namely 'first_name' and 'last_name'
	 * you need to create a database and a table in mysql before running this program
	  */
	public static void main(String[] args) throws Exception {
		
		//url to connect
		//here javaPrac is the name of the database,and the other part is hte port no on which it runs
		// dont change the rest of the url unless you are not using mySQL
		String url ="jdbc:mysql://localhost:3306/javaPrac";
		
		//username and password of sql
		final String user = "root";
		final String pass = "root";
		//query to execute, "table1" is the name of table
		String query = "insert into table1(first_name,last_name) values(?,?)";
		
		//normal jdbc setup
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "Chanpreet");
		ps.setString(2, "Singh");
		ps.executeUpdate();
		System.out.println("Insertion successful");
	}

}
