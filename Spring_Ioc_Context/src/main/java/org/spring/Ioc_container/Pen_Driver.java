package org.spring.Ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_Driver {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen=(Pen)context.getBean("mypen");
		
		pen.penName("Ball-Pen");
//		System.out.println(pen.penPrice(10));
		pen.penPrice(10);

	}

}
