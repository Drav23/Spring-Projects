package org.spring.Ioc_container;

import org.spring.constr_injector.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("laptop.xml");
		Laptop laptop=(Laptop)context.getBean("lap");
		
		laptop.details();
//	    System.out.println(laptop.getBrand());
//	    System.out.println(laptop.getPrice());
//	    System.out.println(laptop.getRam());
//	    System.out.println(laptop.getProccessor());
	    

	}

}
