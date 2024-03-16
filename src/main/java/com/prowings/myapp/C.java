package com.prowings.myapp;

public class C {

	public C() {
		super();
		System.out.println("C initialized!!!");
	}

	public C(String b) {
		super();
		System.out.println(b.getClass().getName());
		System.out.println(">>>>>> value : "+b);
		System.out.println("C(c) initialized!!!");
	}
	
	

}
