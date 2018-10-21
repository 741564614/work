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
			pre=con.prepareStatement("update  people set name=?,faculty=?,majorclass=?,sex=?  where account=?");
			pre.setString(1, n);
			pre.setString(2, f);
			pre.setString(3, m);
			pre.setString(4, s);
			pre.setString(5, account);
			pre.execute();
		}catch(SQLException e) {
			e.printStackTrace();
			return "ÃÓ–¥ ß∞‹";
		}
		
		return "ÃÓ–¥≥…π¶";
	}
}
