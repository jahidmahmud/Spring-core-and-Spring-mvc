package com.coreSpring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/coreSpring/reference/referenceconfig.xml");
		A objA=(A)context.getBean("aref");
		System.out.println(objA);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
