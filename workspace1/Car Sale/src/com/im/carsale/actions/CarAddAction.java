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
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.carsale.model.Car;
import com.im.carsale.utils.DB;

/**
 * Servlet implementation class CarAddAction
 */
@WebServlet("/car_add_action")
public class CarAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		String brandId=request.getParameter("brand-id");
		String modelId=request.getParameter("model-id");
		String fuelId=request.getParameter("fuel-id");
		String description=request.getParameter("description");
		String milege=request.getParameter("milage");
		String year=request.getParameter("year");
		String price=request.getParameter("price");
		String condition=request.getParameter("condition");
		Double dPrice=Double.parseDouble(price);
		int iMilage=Integer.parseInt(milege);
		int iYear=Integer.parseInt(year);
		int iModelId=Integer.parseInt(modelId);
		int iFuelId=Integer.parseInt(fuelId);
		String photo=request.getParameter("photo");
		out.println(iModelId);
		HttpSession session=request.getSession();
		String user_id=session.getAttribute("ID").toString();
		int user=Integer.parseInt(user_id);
		//String milege=request.getParameter("milage");
		String errors="";
		if(title.length()<2)
		{
			errors+="name must contain at leat 2 characters<br>";
		}
		if(brandId.equals("0"))
		{
			errors+="brand must be select<br>";
		}
		if(modelId.equals("0"))
		{
			errors+="model must be select<br>";
		}
		if(fuelId.equals("0"))
		{
			errors+="fuel must be select<br>";
		}
		if(!errors.equals(""))
		{
			response.sendRedirect("car/add.jsp?msg="+errors);
			
		}
		else
		{
			try {			
				
				Car car=new Car();
				car.setTitle(title);
				car.setMilage(iMilage);
				car.setYear(iYear);
				car.setPrice(dPrice);
				char c=condition.charAt(0);
				car.setCondition(c);
				car.setDescription(description);
				car.setPhoto(photo);
				car.setModelId(iModelId);
				car.setFuelTypeId(iFuelId);
				car.setUserId(user);
				Configuration config=new Configuration();
				SessionFactory sf=config.configure().buildSessionFactory();
				Session session1=sf.openSession();
				session1.beginTransaction();
				session1.save(car);
				session1.getTransaction().commit();
				response.sendRedirect("car/list.jsp?msg=Success"); 
			     
				
			} catch (Exception e) {
				e.printStackTrace();
				//out.print("Registration Failed");
			response.sendError(201, "Error:"+e.getMessage());;
			}
		}
	}

}
