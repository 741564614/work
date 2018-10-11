package com.lzw.dao;

import java.sql.*;

public class Getpassword {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static String getPassword(int account)
	{
		String pw="";
		Connectionmysql a=new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("select account,password from people where account=?");
			pre.setLong(1, account);
			res=pre.executeQuery();
			while(res.next()) {
				pw=res.getString("password");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return pw;
		
	}
	public boolean equals(int account,String password) {
		String a=getPassword(account);
		if(a==password) {
			return true;
		}
		else return false;
	}
	
}
