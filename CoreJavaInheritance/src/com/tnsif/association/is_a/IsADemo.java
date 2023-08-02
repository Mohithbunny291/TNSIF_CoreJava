// Usage of the "IS-A" relationship 
package com.tnsif.association.is_a;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Rohith", 101, "Medical");
		Manager manager = new Manager("Mohith", 201, "HR", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}
