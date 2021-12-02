package com.coreSpring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/coreSpring/ci/ciconfig.xml");
		Person person=(Person)context.getBean("person");
		System.out.println(person);
		((ClassPathXmlApplicationContext)context).close();

	}

}
