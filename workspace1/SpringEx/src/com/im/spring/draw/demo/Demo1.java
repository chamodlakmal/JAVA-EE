package com.im.spring.draw.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.im.spring.draw.Shape;

public class Demo1 {
	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
		if(bf.containsBean("ball"))
		{
			Class type=bf.getType("ball");
			System.out.println(type.getSimpleName());			
			Shape myShape=(Shape)bf.getBean("ball");			
			double area=myShape.getArea();
			System.out.println("Area="+area);
		}else
		{
			System.out.println("Shape not found. System down !");
		}
		
	}

}
