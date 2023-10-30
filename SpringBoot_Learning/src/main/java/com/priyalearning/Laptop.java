package com.priyalearning;

import org.springframework.stereotype.Component;

@Component   //object will be automatically created @ bean of the Spring Container
public class Laptop {

	
	private String lid;
	private String brand;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void complie() {
		System.out.println("Compile......");
	}
	
}
