package com.im.hibernate.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.im.hibernate.model.Member;
import com.im.hibernate.model.Student;

public class Demo {
	public static void main(String[] args) {
		Member member=new Member();
		member.setId(1);
		member.setName("Chamod Lakmal");
		member.setPhone("0717865316");
		member.setAddress("Nugegoda");
		
		/*Configuration config=new Configuration();
		SessionFactory sf=config.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();*/
		Student student=new Student();
		student.setId(2);
		student.setAdress("Nugegoda");
		student.setDate1(new Date());
		student.setBdate(new Date());
		student.setDateOfBirth("1997/5/02");
		student.setJoinDate("2019/01/01");
		student.setMotherName("Chalat");
		student.setName("Chamod Lakmal");
		student.setTelephone("0717865316");
		student.setNic("971232862v");
		Configuration config=new Configuration();
		SessionFactory sf=config.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		//session.save(student);
		//session.getTransaction().commit();
		Student m1=(Student)session.get(Student.class, 5);
		System.out.println("Name = "+m1.getName());
		
		java.util.List<Student> list=session.createCriteria(Student.class).list();
		for(Student st1:list)
		{
			System.out.println("Name = "+m1.getName());
		}
		
		Student kamal=(Student)session.get(Student.class, 3);
		
		kamal.setAdress("Nugegoda");
		kamal.setDate1(new Date());
		kamal.setBdate(new Date());
		kamal.setDateOfBirth("1997/5/02");
		kamal.setJoinDate("2019/01/01");
		kamal.setMotherName("Chalat");
		kamal.setName("Chathuranga");
		kamal.setTelephone("0717865316");
		kamal.setNic("971232862v");
		session.update(kamal);
		session.getTransaction().commit();
		
		Student chamod=(Student)session.get(Student.class, 4);
		session.beginTransaction();
		session.delete(chamod);
		session.getTransaction().commit();
		
		
		
		
		
	}

}
