package com.priyalearning.web;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

	
	/*Consturctor is requirement only when Constructor-arg tag used ie., constructor injection
	 * public Tyre(String brand) {
		super();
		this.brand = brand;
	}*/

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre is Autowired";
		//return "Tyre [brand=" + brand + "]";
	}
	
	
}
