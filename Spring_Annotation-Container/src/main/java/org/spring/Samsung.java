package org.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public  class Samsung implements Phone
{
	@Value(value = "S20")
	private String name;
	@Value(value = "Silver")
	private String color;
	@Value(value = "75000")
	private double price;
	
     public void Features() 
     {
    	 System.out.println("The name is:"+name);
     	System.out.println("The Phone Color is:"+color);
     	System.out.println("The Phone Price is:"+price);
	}
}
