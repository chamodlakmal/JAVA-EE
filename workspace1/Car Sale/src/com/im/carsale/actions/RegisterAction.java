package com.im.carsale.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.carsale.model.User;
import com.im.carsale.utils.DB;

@WebServlet("/register_action")
public class RegisterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		String errors="";
		
		if(name.length()<5)
		{
			errors+="Name must have five charactors minimum <br>";
		}
		if(!email.contains("@")){
			errors+="Email not have @ mark <br>";
		}
		if(mobile.length()!=10)
		{
			errors+="Mobile should have 10 nummbers";
		}
		if(!errors.equals(""))
			{
				response.sendRedirect("register.jsp?msg="+errors);
		}
		else
		{
			try {			
				User user=new User();
				user.setId(4);
				user.setName(name);
				user.setEmail(email);
				user.setPassword(password);
				user.setRegDate(new Date());
				user.setRole('m');
				user.setStatus(1);
				user.setMobile(mobile);
				
				Configuration config=new Configuration();
				SessionFactory sf=config.configure().buildSessionFactory();
				Session session=sf.openSession();
				session.beginTransaction();
				session.save(user);
				session.getTransaction().commit();
			    response.sendRedirect("thankyou.jsp");  
				
			} catch (Exception e) {
				e.printStackTrace();
				//out.print("Registration Failed");
				response.sendError(201, "Error:"+e.getMessage());;
			}
		}
	}

}
