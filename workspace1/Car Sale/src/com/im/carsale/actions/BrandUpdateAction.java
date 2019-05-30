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

/**
 * Servlet implementation class BrandUpdateAction
 */
@WebServlet("/brand_update_action")
public class BrandUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		try {			
			Connection con=	DB.getConnection();
			String query="UPDATE brand SET name=? where id=?";
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,id);
			ps.executeUpdate();
			response.sendRedirect("brand/edit.jsp?msg=Success");   
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("brand/edit.jsp?msg=Error not Update please Retry"); 
			
		}
	}

}
