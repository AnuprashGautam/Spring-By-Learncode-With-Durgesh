package com.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/assignment/propsconfig.xml");
		
		Props p1=(Props)context.getBean("prop1");
		
		System.out.println(p1.getProps());
	}

}
