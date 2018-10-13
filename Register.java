package com.lzw.dao;
import java.sql.*;
public class Register {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static String register(String account,String password,String tel) {
		Connectionmysql a= new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("insert into people(password,tel,account) values(?,?,?)");
			pre.setString(1, password);
			pre.setString(2, tel);
			pre.setString(3, account);
			pre.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return "×¢²á³É¹¦";
	}
	
}