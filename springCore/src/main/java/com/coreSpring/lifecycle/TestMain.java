package com.coreSpring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/coreSpring/lifecycle/beanconfig.xml");
//		TestBean tBean=(TestBean)context.getBean("b1");
//		System.out.println(tBean);
//		
//		Laptop laptop=(Laptop)context.getBean("l1");
//		//((ClassPathXmlApplicationContext)context).close();
//		System.out.println(laptop);
//		context.registerShutdownHook();
		
		Example example=(Example)context.getBean("ex1");
		System.out.println(example);
		context.registerShutdownHook();
		((ClassPathXmlApplicationContext)context).close();
	}

}
