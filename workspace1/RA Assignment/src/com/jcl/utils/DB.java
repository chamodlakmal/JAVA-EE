package com.jcl.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dbmirror";
		java.sql.Connection con=DriverManager.getConnection(url, "root", "");	
		return con;
	}

}
