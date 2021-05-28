package com.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {
		
		//get the UI form parameters from the req object
	
		String uiUserName= (String)req.getParameter("userName");
		String uiPassword= (String)req.getParameter("password");
		
		System.out.println("UserNAme:::"+uiUserName);
		System.out.println("Pwd:::"+uiPassword);
		RequestDispatcher rd=null;
		if(uiUserName.equals(uiPassword)) {
			
			rd =req.getRequestDispatcher("/success.jsp"); 
			rd.forward(req, res);
			
		}else {
			
			rd =req.getRequestDispatcher("/error.jsp"); 
			rd.forward(req, res);
			
		}
		
		
		
		
	}

}
