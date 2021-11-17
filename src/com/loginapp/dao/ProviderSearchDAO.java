package com.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.loginapp.domain.ProviderSearchVO;

public class ProviderSearchDAO {
	
	
	public ArrayList<ProviderSearchVO> searchModel( String input) {
		
		   Connection conn = null;
		   PreparedStatement ps = null;
		   ResultSet rs = null;
		   String SQL_QUERY="select * from provider where LASTNAME = ? ";
		  
		   
		   
		   // i val.getSearchedVal();
		   ArrayList<ProviderSearchVO> arr = new ArrayList<>();
		  
			
				try {
					conn =  DBConnectionManager.getConnection();
					ps = conn.prepareStatement(SQL_QUERY);
					ps.setString(1,input);
					//System.out.println("----++++----" + input);
					
					 rs = ps.executeQuery();
					
					
					//System.out.println(rs.getFetchSize() +" is the rs value ");
					while (rs.next()) {
						
						ProviderSearchVO val = new ProviderSearchVO();
						val.setId(rs.getInt(1));
						val.setFirstName(rs.getString(2));
						val.setLastName(rs.getString(3));
						String spec = rs.getString(6);
					    val.setExp(rs.getDouble(7));
					    
					    arr.add(val);					
							
					}
					
				} catch (SQLException | NullPointerException  e) {
					e.printStackTrace();
				}
				finally {
					try {
						rs.close();
						ps.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return arr;
	}
		
	
}
