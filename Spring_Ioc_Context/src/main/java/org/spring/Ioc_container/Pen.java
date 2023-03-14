package org.spring.Ioc_container;

public class Pen 
{
    public int penPrice(int price)
    {
    	System.out.println("Pen price is:"+price);
		return price;
	}
    public void penName(String name)
    {
		System.out.println("Pen name is:"+ name);
	}
	
    
}
