package com.lzw.dao;

import java.sql.*;

public class Connectionmysql {
    static Connection con;
    static PreparedStatement sta;
    static ResultSet res;
    public Connection getConnection() {
    	try{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("数据库驱动加载成功");
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	try{
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_admin?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false","root","root");
    		System.out.println("数据库连接成功");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return con;
    }
}

