package com.loginapp.service;

import com.loginapp.dao.LoginDAO;
import com.loginapp.domain.LoginDomain;

public class UserAuthenticateService {
	LoginDAO loginDao=new LoginDAO();
	public boolean  authenticateUser(LoginDomain loginDto){
		return loginDao.authenticateUser(loginDto);
	
		
	}
	

}
