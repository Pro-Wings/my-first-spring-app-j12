package com.prowings.autowiring;

public class Person {
	
	private int id;
	private String name;
	private Address address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(Address address) {
		super();
		System.out.println("address injected through constructor!!");
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
}
