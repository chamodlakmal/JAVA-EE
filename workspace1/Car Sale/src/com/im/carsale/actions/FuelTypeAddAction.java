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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.carsale.model.FuelType;
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
				FuelType ft=new FuelType();
				ft.setName(name);
				Configuration config=new Configuration();
				SessionFactory sf=config.configure().buildSessionFactory();
				Session session=sf.openSession();
				session.beginTransaction();
				session.save(ft);
				session.getTransaction().commit();
				response.sendRedirect("fuel type/list.jsp?msg=Success");
			     
				
			} catch (Exception e) {
				e.printStackTrace();
				response.sendError(201, "Error:"+e.getMessage());;
			}
		}
		
	}

}
