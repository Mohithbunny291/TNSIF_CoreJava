// Program to demonstrate usage of the "HAS-A" relationship
package com.tnsif.association.has_a;

public class Client {

	public static void main(String[] args) {
		Address address = new Address("405 Ram Nagar, ATP", "Anantapur", "Andhra", "515001");
		Person person = new Person("Mohith", address);
		person.displayInfo();
	}
}
