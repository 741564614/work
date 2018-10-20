package com.lzw.dao;
import java.sql.*;
public class Putperson {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static String putperson(String n,String f,String m,String s,String account) {
		Connectionmysql a= new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("select account from people where account=? insert into people(name,faculty,majorclass,sex) values(?,?,?,?) ");
			pre.setString(1,account);
			pre.setString(2, n);
			pre.setString(3, f);
			pre.setString(4, m);
			pre.setString(5, s);
			pre.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return "ÃÓ–¥≥…π¶";
	}
}
