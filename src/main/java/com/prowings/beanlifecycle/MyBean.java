package com.prowings.beanlifecycle;

public class MyBean {
	
	private int id;
	private String name;

	public MyBean() {
	}


	public void myInitMethod()
	{
		System.out.println("inside myInitMethod()");
	}

	public void myDestroyMethod()
	{
		System.out.println("inside myDestroyMethod()");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [id=" + id + ", name=" + name + "]";
	}
	
}
