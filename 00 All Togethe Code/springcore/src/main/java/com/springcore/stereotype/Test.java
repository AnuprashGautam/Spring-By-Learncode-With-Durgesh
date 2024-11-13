package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student stud=(Student)context.getBean("ob");
		
	    //System.out.println(stud);
		//System.out.println("__________________________________________");
		//System.out.println(stud.getAddresses());
		//System.out.println(stud.getAddresses().getClass().getName());
		
		
		Student stud1= context.getBean("ob",Student.class);
		System.out.println(stud.hashCode());
		System.out.println(stud1.hashCode());
		
		System.out.println("_____________________________________________________-");
		
		Teacher teacher= context.getBean("teacher",Teacher.class);
		Teacher teacher1= context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
	}
}