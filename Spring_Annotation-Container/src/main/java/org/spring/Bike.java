package org.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike
{
	@Value(value = "7735")
     private int id;
	@Value(value = "Appache")
     private String name;
	@Value(value = "TVS")
     private String brand;
     
     public void bikeDetails()
     {
		System.out.println(id);
		System.out.println(name);
		System.out.println(brand);
	}
}
