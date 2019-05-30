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

import com.im.carsale.utils.DB;


@WebServlet("/brand_add_action")
public class BrandAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		PrintWriter out=response.getWriter();
		try {			
			Connection con=	DB.getConnection();
			String query="Insert into brand (name) values (?)";
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
			ps.setString(1,name);
			ps.executeUpdate();
			response.sendRedirect("brand/list.jsp?msg=Success");   
			
		} catch (Exception e) {
			e.printStackTrace();
			out.print("No");
		}
	}

}
