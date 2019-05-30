package com.im.carsale.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.im.carsale.utils.DB;


@WebServlet("/fuel_type_add_action")
public class FuelTypeAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String errors="";
		if(name.length()==0)
		{
			errors+="Fuel type must have a value<br>";
		}
		if(!errors.equals(""))
		{
			response.sendRedirect("fuel type/add.jsp?msg="+errors);
			
		}
		else
		{
			try {			
				Connection con=	DB.getConnection();
				String query="Insert into fuel_type (name) values (?)";
				PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
				ps.setString(1,name);
				
				ps.executeUpdate();
				response.sendRedirect("fuel type/list.jsp?msg=Success");
			     
				
			} catch (Exception e) {
				e.printStackTrace();
				//out.print("Registration Failed");
				response.sendError(201, "Error:"+e.getMessage());;
			}
		}
		
	}

}
