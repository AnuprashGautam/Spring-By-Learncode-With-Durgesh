package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	
	// Same as init() method.
	public void afterPropertiesSet() throws Exception{
		System.out.println("Taking pepsi: init");
	}
	
	// Same as destroy() method.	
	public void destroy() throws Exception{
		System.out.println("Going to put the bottle: destroy");
	}
}