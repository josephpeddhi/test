package com.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutController extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  {
		
		HttpSession session=req.getSession();
		session.removeAttribute("user");
		session.invalidate();
		
		System.out.println("User logged out ");
		RequestDispatcher rd=null;
		rd =req.getRequestDispatcher("/logout.jsp"); 
		rd.forward(req, res);
		
	}

}
