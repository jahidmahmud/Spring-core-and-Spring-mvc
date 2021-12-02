package com.coreSpring.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/coreSpring/steriotype/sterioconfig.xml");
		Student student=context.getBean("s1",Student.class);
		System.out.println(student);
	}

}
