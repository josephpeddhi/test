package com.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginapp.domain.LoginDomain;
import com.loginapp.service.UserAuthenticateService;

public class LoginController extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {
		
		//get the UI form parameters from the req object
	
		String uiUserName= (String)req.getParameter("userName");
		String uiPassword= (String)req.getParameter("password");
		HttpSession session=null;
		// create a DTO
		LoginDomain loginDto=new LoginDomain();
		loginDto.setUserName((uiUserName));
		loginDto.setPassword(uiPassword);
		
		
		
		System.out.println("UserNAme:::"+uiUserName);
		System.out.println("Pwd:::"+uiPassword);
		
		UserAuthenticateService authService=new UserAuthenticateService();
		
		boolean isUserAuthenicated=authService.authenticateUser(loginDto);
		
		
		RequestDispatcher rd=null;
		if(isUserAuthenicated) {
			
			// get the roles of the user
			 session=req.getSession();
			session.setAttribute("user", uiUserName);
			
			rd =req.getRequestDispatcher("/success.jsp"); 
			
			rd.forward(req, res);
			
		}else {
			
			//set a attribute that can be used in JSP
			req.setAttribute("authFailedError", "Inavlid Username or Password");
			rd =req.getRequestDispatcher("/welcome.jsp"); 
			rd.forward(req, res);
			
		}
		
		
		
		
	}

}
