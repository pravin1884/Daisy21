package com.codekuul.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseCode {
	public static String getData() throws SQLException {
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qatest", "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from LoginData");
		while(rs.next()) {
		 String mail = rs.getString("mailId");
		 String pass = rs.getString("password");
		 mail.equalsIgnoreCase(pass);
		
		     
		}
		return port;

	}
	
}
