package com.prowings.beanscopes;

public class Address {
	
	private int pin;
	private String city;
	private String country;
	
	public Address() {
		System.out.println("address no arg constructor executed");
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
