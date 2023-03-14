package org.spring.Ioc_container;

import org.spring.constr_injector.Pc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PcMontr_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("pcmontr.xml");
		Pc pc =(Pc)context.getBean("pc");
		pc.pcDetails();
		pc.getMonitor().monitorDetail();
	}

}
