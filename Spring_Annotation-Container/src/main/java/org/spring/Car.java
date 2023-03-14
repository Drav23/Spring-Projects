package org.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car
{
	@Value(value = "2335")
	private int id;
	@Value(value = "TATA NEXUS")
    private String name;
	@Value(value = "TATA")
    private String brand;
    
    public void carDetails()
    {
		System.out.println(id);
		System.out.println(name);
		System.out.println(brand);
	}
}
