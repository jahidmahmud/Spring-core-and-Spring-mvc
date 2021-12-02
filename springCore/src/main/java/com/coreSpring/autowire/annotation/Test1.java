package com.coreSpring.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("/com/coreSpring/autowire/annotation/autoconfig.xml");
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);
		context.registerShutdownHook();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
