package com.loginapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DBConnectionManager {
	static Connection conn=null;
	
	public static  Connection getConnection(){
		//return the connection
		try {
			System.out.println("Opening Connection...");
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			String url="jdbc:mysql://localhost:3306/provider";
			String passwd="Prud3nt@2";
			String userName="root";
			conn=DriverManager.getConnection (url, userName, passwd);
			System.out.println("Connection="+conn);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return conn;
	}
	

}
