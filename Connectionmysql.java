package com.lzw.dao;

import java.sql.*;

public class Connectionmysql {
    static Connection con;
    static PreparedStatement sta;
    static ResultSet res;
    public Connection getConnection() {
    	try{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("���ݿ��������سɹ�");
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	try{
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_admin?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false","root","root");
    		System.out.println("���ݿ����ӳɹ�");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return con;
    }
}

