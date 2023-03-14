package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{

	private int id;
	private String name;
	private long number;
	private String address;
	
	@Autowired
	private Bike bike;
	@Autowired
	private Car car;
	
	
	public Bike getBike() {
		return bike;
	}


	public void setBike(Bike bike) {
		this.bike = bike;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Customer(@Value(value = "101") int id,@Value(value = "Vinod") String name, @Value(value = "11111800")long number, @Value(value = "Bhandup")String address) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public void custmrDetails() 
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(number);

		System.out.println(address);


	}
	
}
