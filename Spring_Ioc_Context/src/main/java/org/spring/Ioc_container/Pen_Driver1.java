package org.spring.Ioc_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

// Using Spring Core Bean Factory Context

public class Pen_Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("pen.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Pen pen=(Pen)factory.getBean("mypen");
		pen.penName("Apsara");
		pen.penPrice(20);

	}

}
