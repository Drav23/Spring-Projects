package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfigration.xml");
//		Car car=(Car) context.getBean("car");
//		car.carDetails();
//		System.out.println("(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)");
//		Bike bike=(Bike) context.getBean("bike");
//		bike.bikeDetails();
		
//		Customer customer=(Customer) context.getBean("customer");
//		customer.getBike().bikeDetails();
//		System.out.println("(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)");
//		customer.getCar().carDetails();
//		System.out.println("(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)_(*_*)");
//		customer.custmrDetails();
//		System.out.println("(*_*)*_*(*_*)_(*_*)*_*(*_*)_(*_*)*_*(*_*)_(*_*)*_*(*_*)");
		
		Phone_Feature feature=(Phone_Feature) context.getBean("phone_Feature");
		feature.feature();

	}

}
