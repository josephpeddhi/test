package com.loginapp.dao;

public class Provider {
	
	private String fName;
	private String lName;
	private int age;
	private int providerId;
	private String speciality;
	private double exp;
	private String deptName;
	private String gender;
	
	//Setters
	
	public void setFName(String name) {
		this.fName = name;}
	
	public void setLName(String name) {
		this.lName = name;}
	
	public void setAge(int age) {
		this.age = age;}
	
	public void setProviderId(int id) {
		this.providerId = id;}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;}
	
	public void setExp (double exp ) {
		this.exp = exp;}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Getters
	
	public String getFName() {
		return fName; }
	
	public String getLName() {
		return lName;	}
	
	public String getSpeciality() {
		return speciality; }
	
	
	public int getProviderId() {
		
		return providerId;	}
	
	public int getAge() {
		
		return age;	}
	
	public double getExp() {
		
		return exp;	}
	
	
	public String getDeptName() {
		
		return deptName;	}
	
	public String getGender() {
		
		return gender;	}
	

}
