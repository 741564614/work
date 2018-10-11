package com.lzw.dao.model;

public class User {
	private int account;
	private String password;
	public User creat(int a,String p) {
		User user=new User();
		user.account=a;
		user.password=p;
		return user;
	}
	
}