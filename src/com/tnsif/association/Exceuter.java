package com.tnsif.association;

public class Exceuter {

	public static void main(String[] args) {
		Adress address = new Adress("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Person person = new Person("Aniket Pawar", address);
		person.displayInfo();
	}
}