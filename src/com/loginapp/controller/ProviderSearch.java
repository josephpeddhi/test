package com.loginapp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginapp.domain.ProviderSearchVO;
import com.loginapp.service.ProviderService;

/**
 * Servlet implementation class ProviderSearch
 */
//@WebServlet("/ProviderSearch")
public class ProviderSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String lastSearch = request.getParameter("ProvSearch");
		String genderSearch =request.getParameter("genderSearch");
		
		response.setContentType("text/html");
	
		ProviderService providerObj = new ProviderService();
		ArrayList<ProviderSearchVO> providesList = providerObj.SearchMethod(lastSearch);
		
		System.out.println(providesList);
			 for (ProviderSearchVO p : providesList) {
				 
				 System.out.println(p.getId());
				 System.out.println(p.getLastName());
				 System.out.println(p.getFirstName());
				 
			 }
			
			 
			request.setAttribute("searchVal",providesList);	
			RequestDispatcher requestDispatcher; 
			requestDispatcher = request.getRequestDispatcher("/SearchResultSuccess.jsp");
			requestDispatcher.forward(request, response);
				

	}
	

}
