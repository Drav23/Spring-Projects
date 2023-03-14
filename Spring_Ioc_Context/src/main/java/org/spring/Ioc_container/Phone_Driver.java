package org.spring.Ioc_container;

import org.spring.SmartPhone.Phone_Feature;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone_Driver {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("sphone.xml");
		Phone_Feature fture=(Phone_Feature) context.getBean("features");

		fture.feature();
	}

}



// sphone.xml