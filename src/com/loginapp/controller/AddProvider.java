package com.loginapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginapp.dao.DBConnectionManager;
import com.loginapp.dao.Provider;


/**
 * Servlet implementation class AddProvider
 */
//@WebServlet("/AddProvider")
public class AddProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection conn = null;
	
	  
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		conn = DBConnectionManager.getConnection(); 
		Provider provider = new Provider();
		
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		int age =Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		double exp = Double.parseDouble(request.getParameter("exp"));
		String speciality = request.getParameter("speciality");
		int id = Integer.parseInt(request.getParameter("id"));
		String deptName = request.getParameter("deptName");
		PrintWriter out = response.getWriter();
	
		
		provider.setAge(age);
		provider.setFName(fName);
		provider.setLName(lName);
		provider.setGender(gender);
		provider.setSpeciality(speciality);
		provider.setProviderId(id);
		provider.setDeptName(deptName);
		provider.setExp(exp);
		
		PreparedStatement ps = null;
		PreparedStatement ps1 = null ;
		String SQL_QUERY = "insert into PROVIDER(ID,FIRSTNAME,LASTNAME,GENDER,AGE,SPECIALITY,EXPERIENCE,DEPT_NAME) values(?,?,?,?,?,?,?,?) ";
		String SQL_QUERY1 = "insert into DEPARTMENT (DEPT_NAME )values(?) ";
		try {
			ps = conn.prepareStatement(SQL_QUERY);
			ps1 = conn.prepareStatement(SQL_QUERY);
			ps.setInt(1,provider.getProviderId());
			ps.setString(2, provider.getFName());
			ps.setString(3,provider.getLName());
			ps.setString(4, provider.getGender());
			ps.setInt(5,provider.getAge());
			ps.setString(6, provider.getSpeciality());
			ps.setDouble(7, provider.getExp());
			ps.setString(8,provider.getDeptName());
			ps1.setString(1, provider.getDeptName());// change the type 
			int result = ps.executeUpdate();
			
			if(result>0) {
				
				out.println(" Provider Successfully Added ");
				out.println();
				
				out.println("<a href = '/LoginApp/ProviderAdd.jsp'>Click here to Add more Providers </a>");}
			else {
				out.println("Provider Not Successful !!! .");
				
				out.println("<a href = '/LoginApp/ProviderAdd.jsp'>Click here try again</a>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ps1.close();
				ps.close();
				conn.close();
				
			} catch (SQLException e) { 
				e.printStackTrace();}
			
		}		
		
		
	}
}

	
	
	
	

