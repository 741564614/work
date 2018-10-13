package com.lzw.dao;
import java.sql.*;
public class Ergodic {
	static Connection con;
	static Statement pre;
	static ResultSet res;
	public static void ergidic() {
		String account;
		String tel;
		Connectionmysql a=new Connectionmysql();
		con=a.getConnection();
		try {
			pre=con.createStatement();
			res=pre.executeQuery("select account,tel from people");
			System.out.println("account"+"\t"+"    tel");
			while(res.next()) {
				account=res.getString("account");
				tel=res.getString("tel");
				System.out.println(account+"\t"+tel);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
