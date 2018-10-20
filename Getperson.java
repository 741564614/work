package com.lzw.dao;
import java.sql.*;
import com.lzw.dao.model.*;
public class Getperson {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static Person getperson(String account)
	{	
		
		Person person=new Person();
		Connectionmysql a=new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("select account,name,tel,sex,faculty,majorclass from people where account=?");
			pre.setString(1,account);
			res=pre.executeQuery();
			while(res.next()) {
				person.account=res.getString("account");
				person.name=res.getString("name");
				person.tel=res.getString("tel");
				person.sex=res.getString("sex");
				person.faculty=res.getString("faculty");
				person.majorclass=res.getString("majorclass");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return person;
     }
}