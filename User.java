package com.lzw.dao.model;

public class User {
	private String account;
	private String password;
	public User creat(String a,String p) {
		User user=new User();
		user.account=a;
		user.password=p;
		return user;
	}
	
}