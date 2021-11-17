package com.loginapp.service;

import java.util.ArrayList;

import com.loginapp.dao.ProviderSearchDAO;
import com.loginapp.domain.ProviderSearchVO;

public class ProviderService {
	
	
	public ArrayList<ProviderSearchVO> SearchMethod(String input) {
		ProviderSearchDAO pdao = new ProviderSearchDAO();
		return pdao.searchModel(input);		
		
	}
	

}
