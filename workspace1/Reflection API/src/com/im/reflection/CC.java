package com.im.reflection;

import java.lang.reflect.Field;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CC {
	
	public static void save(Object obj)
	{
		Class c=obj.getClass();
		String tableName=c.getSimpleName();
		String cols="";
		String vals="";
		
		Field[] filed=c.getDeclaredFields();
		for(Field field: filed)
		{
			String name=field.getName().toLowerCase();
			cols+=name+",";
			
			try {
				Object val=field.get(obj);
				vals+=" '"+val.toString()+"',";
			} catch (IllegalArgumentException e) {
				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			}
		}
		cols=cols.substring(0,cols.length()-1);
		vals=vals.substring(0,vals.length()-1);
		
		String sql="Insert into "+tableName.toLowerCase()+"("+cols+") VALUES ("+vals+")";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dbsms";
			try {
				java.sql.Connection con=DriverManager.getConnection(url, "root", "");
				Statement stmt=con.createStatement();
				stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Save Success");
		
	}
}
