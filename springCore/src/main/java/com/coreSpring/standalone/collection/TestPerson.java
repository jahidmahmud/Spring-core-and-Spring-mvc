package com.coreSpring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/coreSpring/standalone/collection/standaloneconfig.xml");
		Person person=context.getBean("person1",Person.class);
		System.out.println(person);
	}

}
