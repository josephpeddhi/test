package com.loginapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBConnection {
	static Connection conn=null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		getConnection();
		
	}

	
	public static  void getConnection() throws SQLException{
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			String url="jdbc:mysql://localhost:3306/provider";
			String passwd="Prud3nt@2";
			String userName="root";
			conn=DriverManager.getConnection (url, userName, passwd);
			ps=conn.prepareStatement("SELECT * FROM USER");
			rs=ps.executeQuery();
			while(rs.next())
			
			{
				String userId=rs.getString("USERID");
				String pass=rs.getString("PASSWORD");
				System.out.println("UserID="+userId+"--password:"+pass);
				
			}
			
			rs.close();
			
			//System.out.println("Opening Connection="+conn);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rs!=null)
				rs.close();
			closeConnection(conn);
			
		}
		
		
	}
	
	public static void closeConnection(Connection con) {
		try {
			
			con.close();
			System.out.println("Closing the connection");
		}catch(Exception e) {
			
		}finally {
			if(null!=con)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
	
	
	
	
				
}
