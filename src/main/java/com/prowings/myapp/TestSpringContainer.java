package com.prowings.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer {
	
	public static void main(String[] args) {
		
//		Address address = new Address(123, "Pune", "India");
//		Student student = new Student(10, "Ram", address);
//		System.out.println(student);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Employee emp1 = context.getBean(Employee.class, "emp");
		Employee emp2 = context.getBean(Employee.class, "emp");
		
		System.out.println(">>>>>>>>>> "+(emp1==emp2));
		
		System.out.println(emp1);
		
		Student student = context.getBean(Student.class, "std");
		System.out.println(student);

		Car retrievedCar = context.getBean(Car.class, "car");
		
		System.out.println(retrievedCar);
		
	}

}
