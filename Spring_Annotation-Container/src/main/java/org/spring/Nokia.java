package org.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public  class Nokia implements Phone
{
	@Value(value = "6.1 Plus")
	private String name;
	@Value(value = "Black")
	private String color;
	@Value(value = "18000")
	private double price;
	
    public void Features()
    {
    	System.out.println("The name is:"+name);
    	System.out.println("The Phone Color is:"+color);
    	System.out.println("The Phone Price is:"+price);
    	
    }
}
