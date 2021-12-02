package com.coreSpring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/coreSpring/spel/spelconfig.xml");
		Demo demo=context.getBean("demo",Demo.class);
		System.out.println(demo);

	}

}
