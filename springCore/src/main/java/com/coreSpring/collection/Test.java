package com.coreSpring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/coreSpring/collection/collectionconfig.xml");
		Employee employee=(Employee)context.getBean("emp");
		System.out.println(employee);
		((ClassPathXmlApplicationContext)context).close();

	}

}