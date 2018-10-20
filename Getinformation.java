package com.lzw.dao;
import java.sql.*;
import java.util.*;

import com.lzw.dao.model.Information;
public class Getinformation {
	static Connection con;
	static PreparedStatement pre;
	static ResultSet res;
	public static List<Information> getinformation()
	{	
		
		List<Information> information=new ArrayList<Information>();
		Connectionmysql a=new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.prepareStatement("select name,tel from people ");
		 
			res=pre.executeQuery();
			while(res.next()) {
				Information x=new Information();
				x.name=res.getString(1);
				x.tel=res.getString(2);
				information.add(x);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return information;
	}
}
