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

import com.im.carsale.model.Model;
import com.im.carsale.utils.DB;

@WebServlet("/model_add_action")
public class ModelAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String brandId=request.getParameter("brand-id");
		int bId=Integer.parseInt(brandId);
		String errors="";
		if(name.length()<2)
		{
			errors+="name must contain at leat 2 characters<br>";
		}
		if(brandId.equals("0"))
		{
			errors+="brand must be select<br>";
		}
		if(!errors.equals(""))
		{
			response.sendRedirect("model/add.jsp?msg="+errors);
			
		}
		else
		{
			try {			
				Model model=new Model();
				model.setName(name);
				model.setBrandId(bId);
				Configuration config=new Configuration();
				SessionFactory sf=config.configure().buildSessionFactory();
				Session session=sf.openSession();
				session.beginTransaction();
				session.save(model);
				session.getTransaction().commit();
				response.sendRedirect("model/list.jsp?msg=Success"); 
			     
				
			} catch (Exception e) {
				e.printStackTrace();
				//out.print("Registration Failed");
				response.sendError(201, "Error:"+e.getMessage());;
			}
		}
	}

}
