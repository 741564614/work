package com.lzw.dao;

import java.sql.*;

public class Getpassword {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static String getPassword(String account)
	{
		String pw="";
		Connectionmysql a=new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("select account,password from people where account=?");
			pre.setNString(1, account);//进行了改动
			res=pre.executeQuery();
			while(res.next()) {
				pw=res.getString("password");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return pw;
		
	}
	public static boolean equals(String account,String password) {
		String a=getPassword(account);
		if(a==password) {
			return true;
		}
		else return false;
	}
	
}
