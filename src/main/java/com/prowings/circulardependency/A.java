package com.prowings.circulardependency;

public class A {
	
	private B b;
	
	public A() {
		System.out.println("inside A's no-arg constructor!!");
	}

	
	public A(B b) {
		super();
		this.b = b;
		System.out.println("inside A(B b) constructor!!");
	}


	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("inside setter method of Class A - setB()");
	}
	
	
	

}
