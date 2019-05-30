package com.im.carsale.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.im.carsale.utils.DB;

@WebServlet("/login_action")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		String sql="SELECT * from user where email=? and password=md5(?)";
		try {
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				//User Exist //Authentication
				HttpSession session=request.getSession();
				session.setAttribute("NAME",rs.getString("name"));
				session.setAttribute("ID",rs.getString("id"));
				session.setAttribute("ROLE",rs.getString("role"));
				response.sendRedirect("index.jsp");
			}
			else
			{
				response.sendRedirect("login.jsp?msg=Login Failed Username of Password Incorrect");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
