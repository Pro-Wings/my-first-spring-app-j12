package com.prowings.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer3 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans2.xml");
		
		C beanC = context.getBean(C.class, "c");
	}

}
