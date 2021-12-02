package com.coreSpring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{2+4}")
	private int x;
	@Value("#{2+9}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	//object
	@Value("#{new java.lang.String('Rakib')}")
	private String name;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
