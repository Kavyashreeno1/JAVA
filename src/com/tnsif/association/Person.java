package com.tnsif.association;

//Container class
public class Person {

	private String name;
	private Adress address;

	public Person(String name, Adress address) {
		this.name = name;
		this.address = address;
	}

	// Getter and setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Adress: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()
				+ " " + address.getPostalCode());
	}
}