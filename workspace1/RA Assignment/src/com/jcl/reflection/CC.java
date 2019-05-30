package com.jcl.reflection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jcl.utils.DB;

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
			String url="jdbc:mysql://localhost:3306/dbmirror";
			try {
				java.sql.Connection con=DriverManager.getConnection(url, "root", "");
				Statement stmt=con.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("Save Success");
			} catch (SQLException e) {
				System.out.println("Save failed");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Save failed");
		}
		
		
		
		
	}
	public static void create_table(Object obj)
	{
		Class c=obj.getClass();
		String tableName=c.getSimpleName().toLowerCase();
		Connection con=null;
		DB db=new DB();
		String sql="CREATE table "+tableName+" (";
		String cols="";
		Field[] filed=c.getDeclaredFields();
		for(Field field: filed)
		{
			String name=field.getName().toLowerCase();
			cols+=name+" ";
			Class type=field.getType();
			String dataType=type.getTypeName().toUpperCase();
			if(dataType.equals("JAVA.LANG.STRING"))
			{
				dataType="VARCHAR";
			}
			cols+=dataType+"(50),";
			
			try {
				
				
			} catch (IllegalArgumentException e) {
				
				e.printStackTrace();
			
		}
		}
		sql+=" "+cols;
		sql=sql.substring(0, sql.length()-1);
		sql+=")";
		
		try {
			con= db.getConnection();
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Table is Created");
			
			
		} catch (Exception e) {
			System.out.println("Table is not Created");
			e.printStackTrace();
		}
		
	}
	public static void selectAll(Object obj)
	{
		Class c=obj.getClass();
		String tableName=c.getSimpleName().toLowerCase();
		Connection con=null;
		DB db=new DB();
		String sql="SELECT * FROM "+tableName+"";
		try {
			con=db.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
		      while (rs.next())
		      {
		    	Field[] filed=c.getDeclaredFields();
		  		for(Field field: filed)
		  		{
		  			
		  			String name=field.getName().toLowerCase();
		  			String result=rs.getString(name);
		  			System.out.print(result+"\t");
		  		}
		  		System.out.println("");
 
		      }
		} catch (Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}
	}
	
	public static void selectId(Object obj,int id)
	{
		Class c=obj.getClass();
		String tableName=c.getSimpleName().toLowerCase();
		Connection con=null;
		DB db=new DB();
		String sql="SELECT * FROM "+tableName+" WHERE id="+id+"";
		try {
			con=db.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
		      while (rs.next())
		      {
		    	Field[] filed=c.getDeclaredFields();
		  		for(Field field: filed)
		  		{
		  			
		  			String name=field.getName().toLowerCase();
		  			String result=rs.getString(name);
		  			System.out.print(result+"\t");
		  			
		  		}
		  		System.out.println("");
		    	  
		        
		      }
		} catch (Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}
	}
	public static void deleteById(Object obj,int id)
	{
		Class c=obj.getClass();
		String tableName=c.getSimpleName().toLowerCase();
		Connection con=null;
		DB db=new DB();
		String sql="DELETE FROM "+tableName+" WHERE id="+id+"";
		try {
			con=db.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Deleted");
		      
		} catch (Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}
	}
	
}
