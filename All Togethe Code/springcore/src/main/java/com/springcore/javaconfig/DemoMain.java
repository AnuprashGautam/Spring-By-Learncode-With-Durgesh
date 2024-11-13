package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// We can use either "student", "con", "temp" in the below line of code.
		
		Student student=(Student)context.getBean("temp");
		System.out.println(student);
		
		student.study();
	}
}
