package com.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.loginapp.domain.LoginDomain;

public class LoginDAO {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public  static final String AUTHENTICATE_USER="SELECT * FROM USER WHERE USERID= ? AND PASSWORD= ? ";
	public boolean authenticateUser(LoginDomain loginDto){
		// get the connection object\
		//we need the Prepared stement 
		String userId="";
		String pass="";
		boolean isAuthenticated=false;
		try {
		conn=DBConnectionManager.getConnection();
		ps=conn.prepareStatement(AUTHENTICATE_USER);
		ps.setString(1,loginDto.getUserName() );
		ps.setString(2,loginDto.getPassword() );
		rs=ps.executeQuery();
		
		while(rs.next()) {
			
			 userId=rs.getString("USERID");
			 pass=rs.getString("PASSWORD");
			
			
		}
		
		if(userId.isEmpty()&& pass.isEmpty()) {
			
			
			isAuthenticated=false;
			
		}else {
			isAuthenticated=true;
		}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return isAuthenticated;
		
		
	}
	

}
