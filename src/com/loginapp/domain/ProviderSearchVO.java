package com.loginapp.domain;

public class ProviderSearchVO {
	
	private  int id;
	private String lastName;
	private String firstName;
	private double exp;
	
	private String searchedVal = " ";



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	//	System.out.println("First Name : "+firstName);
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
		//System.out.println("Exp : "+exp);
	}

	public String getSearchedVal() {
		
		return searchedVal;
	}

	public  void setSearchedVal(String searched) {
		this.searchedVal = searched;
		//System.out.println(" Dao Searching val : "+searchedVal);
	}
	
	
		

}
