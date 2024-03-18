package com.prowings.circulardependency;

public class B {
	
	private A a;
	
	public B() {
		System.out.println("inside B's no-arg constructor!!");
	}


	public A getA() {
		return a;
	}
	
	public B(A a) {
		super();
		this.a = a;
		System.out.println("inside B(A a) constructor!!");
	}


	public void setA(A a) {
		this.a = a;
		System.out.println("inside setter method of Class B - setA()");
	}
	
	

}
