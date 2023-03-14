package org.spring.constr_injector;

public class Laptop
{
    private String brand;
    private double price;
    private String ram;
    private String proccessor;
	
    public Laptop(String brand, double price, String ram, String proccessor) {
		
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.proccessor = proccessor;
	}
    
    public void details() {
		System.out.println("Brand is:"+brand);
		System.out.println("Price is:"+price);
		System.out.println("Ram is:"+ram);
		System.out.println("Proccessor is:"+proccessor);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProccessor() {
		return proccessor;
	}

	public void setProccessor(String proccessor) {
		this.proccessor = proccessor;
	}
        
    
}
