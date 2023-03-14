package org.spring.constr_injector;

public class Pc
{
	private String pcname;
	private String proccessor;
	private String pccolor;
	private double pcprice;
	
	private Monitor monitor;

	public Pc(String pcname, String proccessor, String pccolor, double pcprice, Monitor monitor) {
	
		this.pcname = pcname;
		this.proccessor = proccessor;
		this.pccolor = pccolor;
		this.pcprice = pcprice;
		this.monitor = monitor;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public void pcDetails()
	{
		System.out.println("Pc name :"+pcname);
		System.out.println("Pc proccessor :"+proccessor);
		System.out.println("Pc color :"+pccolor);
		System.out.println("Pc price :"+pcprice);
//		monitor.monitorDetail();  //we can print monitor details using this statement also
	}
	

}
