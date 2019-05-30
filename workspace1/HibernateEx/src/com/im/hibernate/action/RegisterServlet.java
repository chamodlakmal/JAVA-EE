package com.im.hibernate.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.hibernate.model.Member;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String tp=request.getParameter("tp");
		Member member=new Member();
		member.setId(1);
		member.setName(name);
		member.setPhone(tp);
		member.setAddress(address);
		
		Configuration config=new Configuration();
		SessionFactory sf=config.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
	}

}
