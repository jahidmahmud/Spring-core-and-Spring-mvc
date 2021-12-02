package com.coreSpring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean,DisposableBean{
	private double price;

	@Override
	public String toString() {
		return "Laptop [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("laptop init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("laptop destroy");
		
	}
	
}
