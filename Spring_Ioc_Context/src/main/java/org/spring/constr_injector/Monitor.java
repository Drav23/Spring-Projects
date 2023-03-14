package org.spring.constr_injector;

public class Monitor 
{
    private String mname;
    private String mcolor;
    private double mprice;
    private String msize;
	
    public Monitor(String mname, String mcolor, double mprice, String msize) {
		
		this.mname = mname;
		this.mcolor = mcolor;
		this.mprice = mprice;
		this.msize = msize;
	}
    
    public void monitorDetail() 
    {
		System.out.println("Monitor name is:"+mname);
		System.out.println("Monitor color is:"+mcolor);
		System.out.println("Monitor price is:"+mprice);
		System.out.println("Monitor size is:"+msize);
	}
    
    
}
