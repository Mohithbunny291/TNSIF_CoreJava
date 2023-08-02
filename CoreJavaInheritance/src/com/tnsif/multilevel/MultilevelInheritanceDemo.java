//Program to demonstrate MultiLevel inheritance
package com.tnsif.multilevel;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		City city = new City();
		city.setCityName("Anantapur");
		city.setArea(264.2f);
		city.setStateName("Andhra");
		city.setLanguage("Telugu");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);

	}

}
