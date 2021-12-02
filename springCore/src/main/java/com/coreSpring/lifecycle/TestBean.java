package com.coreSpring.lifecycle;

public class TestBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestBean [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("from init block");
	}
	
	public void destroy() {
		System.out.println("from destroy block");
	}
	

}
