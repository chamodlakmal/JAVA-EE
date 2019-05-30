package com.im.carsale.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.carsale.model.Brand;
import com.im.carsale.utils.DB;


@WebServlet("/brand_add_action")
public class BrandAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		PrintWriter out=response.getWriter();
		try {			
			Brand brand=new Brand();
			brand.setName(name);
			Configuration config=new Configuration();
			SessionFactory sf=config.configure().buildSessionFactory();
			Session session=sf.openSession();
			session.beginTransaction();
			session.save(brand);
			session.getTransaction().commit();
			response.sendRedirect("brand/list.jsp?msg=Success");   
			
		} catch (Exception e) {
			e.printStackTrace();
			out.print("No");
		}
	}

}
