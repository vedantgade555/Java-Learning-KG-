package com.entity;

public class User {
	private int id;
	private String fullname;
	private String emai;
	private String password;
	
	
	
	public User(String fullname, String emai, String password) {
		super();
		this.fullname = fullname;
		this.emai = emai;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
